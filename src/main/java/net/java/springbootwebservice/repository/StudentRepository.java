package net.java.springbootwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springbootwebservice.model.Student;

//exposes database methods
//no boiler code for DAO layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
 

/*

JpaRepository is a JPA (Java Persistence API) specific extension of Repository. 
It contains the full API of CrudRepository and PagingAndSortingRepository. 
So it contains API for basic CRUD operations and also API for pagination and sorting.



*/