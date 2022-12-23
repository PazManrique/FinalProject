package es.com.capgemini.finalproject.service;



import java.sql.Timestamp;
import java.util.Calendar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.model.util.MoveUtil;
import es.com.capgemini.finalproject.repo.ResultRepo;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class ResultService{
	
	@Autowired
	ResultRepo resultRepo;
	
	public Iterable<Result> resultList(){
		return MoveUtil.asResults(resultRepo.findAll());
	}
	
	public Result saveResult(Move pResult) {
		pResult.setComputerChoice((int)(Math.random()*5)+1);
		Calendar cal = Calendar.getInstance();
		
		pResult.setDateTime(new Timestamp(cal.getTimeInMillis()));
		resultRepo.save(pResult);
		return pResult.moveResult();
	}
	

}
