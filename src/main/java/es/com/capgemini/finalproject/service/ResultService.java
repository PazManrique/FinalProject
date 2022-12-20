package es.com.capgemini.finalproject.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.repo.ResultRepo;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ResultService{
	
	@Autowired
	ResultRepo resultRepo;
	
	public Iterable<Result> resultList(){
		return resultRepo.findAll();
		
	}
	
	public void saveResult(Result pResult) {
		resultRepo.save(pResult);
	}

	
	
	 public Result findById(int theId) {
			Optional<Result> result = resultRepo.findById(theId);
			
			Result pResult = null;
			
			if (result.isPresent()) {
				pResult = result.get();
			}
			else {
				throw new RuntimeException("Did not find product id - " + theId);
			}
			
			return pResult;
		}

		public void save(Result pResult) {
			resultRepo.save(pResult);
		}

		public void deleteById(int theId) {
			resultRepo.deleteById(theId);
		}
	
	
	
	
}
