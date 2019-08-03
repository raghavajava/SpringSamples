package com.example.webprojects.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webprojects.model.SearchSet;
import com.example.webprojects.service.InsertSets;

@RestController
public class WebController {

	
	@Autowired
	InsertSets insertSets;
	
	@RequestMapping("/welcome")
	public String controllers() {
		return "Rest Controller Enabled";
	}
	
	/*@GetMapping("/search/{numberToBeSearched}")
	public String getControllers(@PathVariable int numberToBeSearched) {
		bubbleSort.getBubbleSort();
		return "Rest Controller Enabled--"+numberToBeSearched;
	}*/
	
	@PostMapping("/search")
	public String insertValuess(@RequestBody SearchSet newSearchSet) {
		String responseText="successfully Added";
		System.out.println(newSearchSet);
		insertSets.insertSearchset(newSearchSet);
		return "successfully Added";
	}
}
