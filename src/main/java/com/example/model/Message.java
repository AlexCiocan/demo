package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="MY_MESSAGE")

@EntityListeners(AuditingEntityListener.class)
public class Message implements Serializable {
	
	@Id
	private Long id;
	
	private String message;
	
	@OneToOne
	private Language lang;
	
//	@RevisionNumber
//	private Integer revisionNumber;
//	
//	@RevisionTimestamp
//	private long lastModified;
	
	
	
	

//	public long getLastModified() {
//		return lastModified;
//	}
//
//	public void setLastModified(long lastModified) {
//		this.lastModified = lastModified;
//	}
//
//	public Integer getRevisionNumber() {
//		return revisionNumber;
//	}
//
//	public void setRevisionNumber(Integer revisionNumber) {
//		this.revisionNumber = revisionNumber;
//	}

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
	
	
	
	

}
