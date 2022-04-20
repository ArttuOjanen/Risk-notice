package com.example.risknotice.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	List<Notice> findByTitle(String title);
}
