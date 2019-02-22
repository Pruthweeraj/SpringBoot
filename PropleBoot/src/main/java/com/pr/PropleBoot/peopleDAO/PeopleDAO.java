package com.pr.PropleBoot.peopleDAO;

import org.springframework.data.repository.CrudRepository;

import com.pr.PropleBoot.bean.People;


public interface PeopleDAO extends CrudRepository<People, Integer> {

	
}
