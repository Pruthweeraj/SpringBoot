package com.pr.peopleService;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pr.bean.People;
import com.pr.peopleDAO.PeopleDAO;

@Service
public class PeopleService {

	@Autowired
	private PeopleDAO peopleDAO;

	public List<People> getAllPeoples() {
		List<People> peoples = null;
		Iterator<People> itr = peopleDAO.findAll().iterator();
		while (itr.hasNext()) {
			peoples.add(itr.next());
		}
		return peoples;
	}

	public void savePeople(People people) {
		peopleDAO.save(people);
	}

	public void updatePeople(int id, People people) {
		People p = peopleDAO.findById(id).get();
		peopleDAO.save(p);
	}

	public void deletePeople(int id) {
		peopleDAO.deleteById(id);
	}
}
