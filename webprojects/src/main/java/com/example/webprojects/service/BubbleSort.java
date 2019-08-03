package com.example.webprojects.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class BubbleSort {

	
	public String getBubbleSort() {
		return "Bubble Sort Done";
	}
	
	
}
