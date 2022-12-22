package es.com.capgemini.finalproject.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.com.capgemini.finalproject.model.Move;


@SpringBootTest
class ResultRepoTest {

	@Autowired
	ResultRepo resultRepo;

	@Test
	void testFindAll() {
		
	assertEquals(0, resultRepo.findAll().size());
	}
	
	@Test
	void testSave() {
		Move move = new Move(1, "jugada", 4, 5);		
		Move moveRet = resultRepo.save(move);

		assertEquals(move.getPlayerName(), moveRet.getPlayerName());
	
	}
	
	
}
