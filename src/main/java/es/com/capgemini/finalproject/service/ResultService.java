package es.com.capgemini.finalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.Move;

import es.com.capgemini.finalproject.repo.ResultRepo;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ResultService{
	
	@Autowired
	ResultRepo resultRepo;
	
	public Iterable<Move> resultList(){
		return resultRepo.findAll();
		
	}
	
	public void saveResult(Move pResult) {
		resultRepo.save(pResult);
	}

	
	public void saveResultComputer(Move pResult) {
		pResult.setComputerChoice((int)(Math.random()*5)+1);
		resultRepo.save(pResult);
		
	}

		
	
	
		
		
		
		
		
		
}
