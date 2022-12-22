package es.com.capgemini.finalproject.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import es.com.capgemini.finalproject.model.Move;



public interface ResultRepo extends JpaRepository<Move,Integer>{


}
