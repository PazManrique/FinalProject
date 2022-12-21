package es.com.capgemini.finalproject.service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import es.com.capgemini.finalproject.model.Move;

import es.com.capgemini.finalproject.repo.ResultRepo;
import jakarta.transaction.Transactional;
//@Service
//@Transactional
public class ResultService{
	
	@Autowired
	ResultRepo resultRepo;
	
	public Iterable<Move> resultList(){
		return resultRepo.findAll();
		
	}
	
	public void saveResult(Move pResult) {
		resultRepo.save(pResult);
	}

	
	
	 public Move findById(int theId) {
			Optional<Move> result = resultRepo.findById(theId);
			
			Move pResult = null;
			
			if (result.isPresent()) {
				pResult = result.get();
			}
			else {
				throw new RuntimeException("Did not find product id - " + theId);
			}
			
			return pResult;
		}

		public void save(Move pResult) {
			resultRepo.save(pResult);
		}

		public void deleteById(int theId) {
			resultRepo.deleteById(theId);
		}
	
	
	
	
		
		
		
		
		
		
}
