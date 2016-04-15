package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.EntityTrackingRevisionListener;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "MY_LANG")
@EntityListeners(AuditingEntityListener.class)
public class Language implements Serializable {

	@Id
	private Long id;

	private String isocode;

//	@RevisionNumber
//	private Integer revisionNumber;
//	
//	@RevisionTimestamp
//	private long lastModified;
//	
	
	
	
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

	public String getIsocode() {
		return isocode;
	}

	public void setIsocode(String isocode) {
		this.isocode = isocode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
