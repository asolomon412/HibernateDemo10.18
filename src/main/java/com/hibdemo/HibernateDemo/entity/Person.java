package com.hibdemo.HibernateDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity // this maps us to the table
// @Table(name="people") can use this if your table name does not match your
// pojo
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {

	@Id // this is referring to the primary key for hibernate
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this is allowing mysql to auto-increment and
	// generate the primary key for us
	private Integer id;

	// @Column(name="name") only needed if our column names don't match
	private String name;
	private String location;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public Person(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

}
