package com.example.webprojects.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webprojects.model.SearchSet;
import com.example.webprojects.repository.SearchSetRepository;

@Service
public class InsertSets {

	@Autowired
	SearchSetRepository searchSetRepository;
	
	public void insertSearchset(SearchSet newSearchSet) {
		searchSetRepository.save(newSearchSet);
	}
	
	
}
