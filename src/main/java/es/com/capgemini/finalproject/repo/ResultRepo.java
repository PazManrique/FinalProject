package es.com.capgemini.finalproject.repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.com.capgemini.finalproject.model.Result;

@Repository
public interface ResultRepo extends CrudRepository<Result, Integer>{


}
