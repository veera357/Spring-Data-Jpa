package in.veera.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.veera.entity.Person;
import in.veera.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	public PersonService personService;
	
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
	
	@GetMapping("/get")
	public List<Person> getAllPerson(){
		return personService.getAllPerson();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Person> getPersonbyId(@PathVariable Long id){
		return personService.getPersonbyId(id);
	}
	
	@GetMapping("/get/{date}")
	public List<Person> getPersonbyDate(@Param("cdate") Date date){
		List<Person> personbyDate = personService.getPersonbyDate(date);
		return personbyDate;
	}
	

}
