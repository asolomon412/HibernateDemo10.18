package com.hibdemo.HibernateDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibdemo.HibernateDemo.entity.Person;
// --- this class is no longer being used!!! *****
@Repository
@Transactional // allows us to manage all of transactions for the DB
public class PersonDao {

	@PersistenceContext // entities are stored in the persistence context
	// Entity Manager is an interface that manages the process
	EntityManager eManager;
	
	public Person findById(int id) {
		return eManager.find(Person.class, id);
	}
	
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = eManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}
	
	public Person addOrUpdate(Person p) {
		return eManager.merge(p);
	}
	
	public void deleteById(int id) {
		// we need to find the person by their id
		Person person1 = findById(id);
		eManager.remove(person1);
	}
	
	
}
