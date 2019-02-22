package com.pr.PropleBoot.peopleService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pr.PropleBoot.bean.People;
import com.pr.PropleBoot.peopleDAO.PeopleDAO;

@Service
public class PeopleService {

	@Autowired
	private PeopleDAO peopleDAO;

	public List<People> getAllPeoples() {
		List<People> peoples = new ArrayList<People>();
		Iterator<People> itr = peopleDAO.findAll().iterator();
		while (itr.hasNext()) {
			peoples.add(itr.next());
		}
		return peoples;
	}

	public void savePeople(People people) {
		peopleDAO.save(people);
	}

	public void updatePeople(People people) {
		
		peopleDAO.save(people);
	}

	public void deletePeople(int id) {
		peopleDAO.deleteById(id);
	}

	public Optional<People> getPeopleById(int id) {
		return peopleDAO.findById(id);
	}
}
