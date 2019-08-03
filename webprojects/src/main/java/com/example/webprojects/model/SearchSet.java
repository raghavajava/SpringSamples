package com.example.webprojects.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SearchSet {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String searchSetName;
	private String valuess;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSearchSetName() {
		return searchSetName;
	}
	public void setSearchSetName(String searchSetName) {
		this.searchSetName = searchSetName;
	}
	public String getValuess() {
		return valuess;
	}
	public void setValuess(String valuess) {
		this.valuess = valuess;
	}
	@Override
	public String toString() {
		return "SearchSet [id=" + id + ", searchSetName=" + searchSetName + ", valuess=" + valuess + "]";
	}
	
	
}
