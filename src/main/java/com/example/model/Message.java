package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import com.mysema.query.types.Predicate;
import com.mysema.query.types.path.StringPath;

@Entity
@Table(name = "MY_MESSAGE")
@QuerydslPredicate(bindings = Message.class)
public class Message implements Serializable, QuerydslBinderCustomizer<QMessage> {

	

	@Id
	private Long id;

	private String message;

	@OneToOne
	private Language lang;

	// @RevisionNumber
	// private Integer revisionNumber;
	//
	// @RevisionTimestamp
	// private long lastModified;

	// public long getLastModified() {
	// return lastModified;
	// }
	//
	// public void setLastModified(long lastModified) {
	// this.lastModified = lastModified;
	// }
	//
	// public Integer getRevisionNumber() {
	// return revisionNumber;
	// }
	//
	// public void setRevisionNumber(Integer revisionNumber) {
	// this.revisionNumber = revisionNumber;
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Language getLang() {
		return lang;
	}

	public void setLang(Language lang) {
		this.lang = lang;
	}

	@Override
	public void customize(QuerydslBindings bindings, QMessage root) {
		bindings.bind(String.class).first(new SingleValueBinding<StringPath, String>() {
			@Override
			public Predicate bind(StringPath path, String value) {
				return path.startsWith(value);
			}
		});
		
	}

}
