package es.com.capgemini.finalproject.repo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
		
	}
}
