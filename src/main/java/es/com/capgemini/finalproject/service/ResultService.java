package es.com.capgemini.finalproject.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.repo.ResultRepo;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ResultService {
	
	@Autowired
	ResultRepo resultRepo;
	
	public Iterable<Result> resultList(){
		return resultRepo.findAll();
		
	}
	
	public void saveResult(Result pResult) {
		resultRepo.save(pResult);
	}

}
