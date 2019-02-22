package com.pr.PropleBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pr.PropleBoot.bean.People;
import com.pr.PropleBoot.peopleService.PeopleService;

@RestController
public class PeopleController {

	@Autowired
	private PeopleService peopleService;

	@GetMapping("/peoples")
	public List<People> getAllPeoples() {
		System.out.println("inside get");
		return peopleService.getAllPeoples();
	}

	@PostMapping("/peoples")
	public void savePeople(@RequestBody People people) {
		peopleService.savePeople(people);
	}

	@PutMapping("/peoples")
	public void updatePeople( @RequestBody People people) {
		peopleService.updatePeople( people);
	}

	@DeleteMapping("/peoples/{id}")
	public void deletePeople(@PathVariable int id) {
		peopleService.deletePeople(id);
	}

	@GetMapping("/peoples/{id}")
	public Optional<People> getPeopleById(@PathVariable int id) {
		return peopleService.getPeopleById(id);
	}

}
