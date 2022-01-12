package in.veera.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.veera.entity.Person;
import in.veera.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(Person person) {
		Person save = personRepository.save(person);
		return save;
	}

	/*
	 * public Person getPersonByDate(Date date) { return
	 * personRepository.getCdate(date); }
	 */

	public List<Person> getAllPerson() {

		return personRepository.findAll();

	}
	
	public Optional<Person> getPersonbyId(Long id){
		return personRepository.findById(id);
	}
	
	public List<Person> getPersonbyDate(Date date){
		 List<Person> findByCdate = personRepository.findByCdate(date);
		 return findByCdate;
	}

}
