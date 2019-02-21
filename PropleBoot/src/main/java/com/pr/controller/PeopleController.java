package com.pr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pr.bean.People;
import com.pr.peopleService.PeopleService;

@RestController
public class PeopleController {

	@Autowired
	private PeopleService peopleService;
	
	@GetMapping("/peoples")
	public List<People> getAllPeoples(){
		return peopleService.getAllPeoples();
	}
	
	@PostMapping("/peoples")
	public void savePeople(@RequestBody People people) {
		peopleService.savePeople(people);
	}
	
	@PutMapping("/peoples/{id}")
	public void updatePeople(@PathVariable int id , @RequestBody People people) {
		peopleService.updatePeople(id,people);
		}	
	
	@DeleteMapping("/peoples/{id}")
	public void deletePeople(@PathVariable int id) {
		peopleService.deletePeople(id);
	}
	
	
}
