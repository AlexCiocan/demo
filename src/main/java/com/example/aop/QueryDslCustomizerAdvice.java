package com.example.aop;

import java.util.Iterator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.support.Repositories;
import org.springframework.data.util.TypeInformation;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QueryDslCustomizerAdvice {

	@Autowired
	private Repositories repositories;

	@Around("execution(* org.springframework.data.querydsl.binding.QuerydslBindingsFactory.createBindingsFor(..)) && args(customizer,domainType) ")
	public Object handleQueryDslCustomizer(ProceedingJoinPoint pjp,
			@SuppressWarnings("rawtypes") Class<? extends QuerydslBinderCustomizer> customizer,
			TypeInformation<?> domainType) throws Throwable {
		if (customizer == null) {
			Iterator<Class<?>> iterator = repositories.iterator();
			Object repo = null;
			while (iterator.hasNext()) {
				final Class<?> cls = iterator.next();
				final String name = cls.getSimpleName();
				if (domainType.getType().getSimpleName().equals(name)) {
					repo = repositories.getRepositoryFor(cls);
				}

			}
			if (repo != null) {
				QuerydslPredicate predicate = org.springframework.core.annotation.AnnotationUtils.findAnnotation(
						repo.getClass(), org.springframework.data.querydsl.binding.QuerydslPredicate.class);
				if (predicate != null) {
					customizer = predicate.bindings();
				}

			}
		}
		return pjp.proceed(new Object[] { customizer, domainType });
	}

}
