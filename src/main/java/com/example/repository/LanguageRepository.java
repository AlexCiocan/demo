package com.example.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.model.Language;

@RepositoryRestResource
public interface LanguageRepository extends PagingAndSortingRepository<Language, Long>,QueryDslPredicateExecutor<Language>{

}
