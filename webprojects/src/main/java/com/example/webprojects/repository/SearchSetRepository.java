package com.example.webprojects.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.webprojects.model.SearchSet;

public interface SearchSetRepository  extends CrudRepository<SearchSet, Long>{

}
