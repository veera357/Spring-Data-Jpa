package in.veera.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.veera.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@Query(value = "select * from person where cdate='2020-11-06'" , nativeQuery = true)
	public List<Person> findByCdate(Date cdate);
	

}
