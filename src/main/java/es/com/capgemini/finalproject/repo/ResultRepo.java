package es.com.capgemini.finalproject.repo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.com.capgemini.finalproject.model.Move;



public interface ResultRepo extends CrudRepository<Move,Integer>{


}
