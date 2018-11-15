package com.hibdemo.HibernateDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibdemo.HibernateDemo.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
