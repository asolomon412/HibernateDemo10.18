package com.hibdemo.HibernateDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hibdemo.HibernateDemo.dao.PersonRepository;
import com.hibdemo.HibernateDemo.entity.Person;

@Controller
public class PersonController {

	@Autowired
	PersonRepository p;

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index", "peoplelist", p.findAll());
	}

	@RequestMapping("/search")
	public ModelAndView seachResults(@RequestParam("personid") Integer id) {

		
		return new ModelAndView("searchstuff", "results", p.findById(id).orElse(null));
	}

	@RequestMapping("/addperson")
	public ModelAndView addNewPerson(@RequestParam("pname") String name, @RequestParam("plocation") String location) {

		Person p1 = new Person(name, location);
		p.save(p1);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/update")
	public ModelAndView showForm(@RequestParam("personid") String pId) {
		return new ModelAndView("update-form", "id", pId);

	}

	@RequestMapping("/updateperson")
	public ModelAndView updatePerson(Person person) {
		// System.out.println(person);
		p.save(person);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping("/delete")
	public ModelAndView removePerson(@RequestParam("personid") int id) {
		p.deleteById(id);
		return new ModelAndView("redirect:/");
	}

}
