package com.example.demo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@GetMapping("/person")
	public List<Person> getAllPerson() {
		return (List<Person>) personRepository.findAll();
	}

	@GetMapping("/person/{id}")
	public ResponseEntity<Optional<Person>> getPersonById(@PathVariable(value = "id") Integer personId) {
		Optional<Person> person = personRepository.findById(personId);
		return ResponseEntity.ok().body(person);
	}

	

	@PostMapping("/person")
    public Person createEmployee(@RequestBody Person person) {
    return personRepository.save(person);
	}
}