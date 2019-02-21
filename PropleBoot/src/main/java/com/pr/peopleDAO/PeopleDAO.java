package com.pr.peopleDAO;

import org.springframework.data.repository.CrudRepository;

import com.pr.bean.People;

public interface PeopleDAO extends CrudRepository<People, Integer> {

	
}
