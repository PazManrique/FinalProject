package es.com.capgemini.finalproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.MoveFront;

public interface MoveRepo extends JpaRepository<Move, Integer>{
	
	

}
