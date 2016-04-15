package com.example.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.model.Message;
import com.mysema.query.types.Predicate;

@RepositoryRestResource
@QuerydslPredicate(bindings=Message.class)
public interface MessageRepository extends PagingAndSortingRepository<Message, Long>,
		QueryDslPredicateExecutor<Message> {
	 List<Message> findByMessage(@Param("message") String message);
	
	 
	 @RestResource
	 Iterable<Message> findAll(@QuerydslPredicate(bindings=Message.class) Predicate predicate);


}
