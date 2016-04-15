package com.example.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.model.Message;

@RepositoryRestResource
@Repository
public interface MessageRepository extends PagingAndSortingRepository<Message, Long>,QueryDslPredicateExecutor<Message>
//,RevisionRepository<Message,Long,Integer>
{
	public List<Message> findByMessage(@Param("message")String message);
}
