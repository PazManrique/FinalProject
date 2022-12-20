package es.com.capgemini.finalproject.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.com.capgemini.finalproject.model.Result;


public interface ResultRepo extends JpaRepository<Result, Integer>{


}
