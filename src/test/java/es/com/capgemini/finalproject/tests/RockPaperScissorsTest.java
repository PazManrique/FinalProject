package es.com.capgemini.finalproject.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import es.com.capgemini.finalproject.model.CharacterFactory;
import es.com.capgemini.finalproject.model.Dustin;
import es.com.capgemini.finalproject.model.Eleven;
import es.com.capgemini.finalproject.model.Max;
import es.com.capgemini.finalproject.model.Mike;
import es.com.capgemini.finalproject.model.Move;
import es.com.capgemini.finalproject.model.Result;
import es.com.capgemini.finalproject.model.Vecna;

class RockPaperScissorsTest {

	// lote de pruebas
	CharacterFactory dustin, dustin2, max, max2, eleven, eleven2, vecna, vecna2, mike, mike2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		dustin = new Dustin();
		dustin2 = new Dustin();
		max = new Max();
		max2 = new Max();
		eleven = new Eleven();
		eleven2 = new Eleven();
		vecna = new Vecna();
		vecna2 = new Vecna();
		mike = new Mike();
		mike2 = new Mike();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		dustin = null;
		dustin2 = null;
		max = null;
		max2 = null;
		eleven = null;
		eleven2 = null;
		vecna = null;
		vecna2 = null;
		mike = null;
		mike2 = null;
	}
	

	// instance

	@Test
	void testGetInstanceDustin_true() {
		assertTrue(CharacterFactory.getInstance(CharacterFactory.DUSTIN) instanceof Dustin);
	}

	@Test
	void testGetInstanceMax_true() {
		assertTrue(CharacterFactory.getInstance(CharacterFactory.MAX) instanceof Max);
	}

	@Test
	void testGetInstanceEleven_true() {
		assertTrue(CharacterFactory.getInstance(CharacterFactory.ELEVEN) instanceof Eleven);
	}
	
	@Test
	void testGetInstanceVecna_true() {
		assertTrue(CharacterFactory.getInstance(CharacterFactory.VECNA) instanceof Vecna);
	}

	@Test
	void testGetInstanceMike_true() {
		assertTrue(CharacterFactory.getInstance(CharacterFactory.MIKE) instanceof Mike);
	}

	@Test
	void testGetInstanceDustin_false() {
		assertFalse(CharacterFactory.getInstance(CharacterFactory.DUSTIN) instanceof Eleven);
	}

	@Test
	void testGetInstanceMax_false() {
		assertFalse(CharacterFactory.getInstance(CharacterFactory.MAX) instanceof Eleven);
	}

	@Test
	void testGetInstanceEleven_false() {
		assertFalse(CharacterFactory.getInstance(CharacterFactory.ELEVEN) instanceof Max);
	}
	
	@Test
	void testGetInstanceVecna_false() {
		assertFalse(CharacterFactory.getInstance(CharacterFactory.VECNA) instanceof Max);
	}

	@Test
	void testGetInstanceMike_false() {
		assertFalse(CharacterFactory.getInstance(CharacterFactory.MIKE) instanceof Max);
	}

	// dustin
	@Test
	void testDustinPierdeContraEleven() {
		assertEquals(-1, dustin.compare(eleven));

	}
	
	@Test
	void testDustinPierdeContraVecna() {
		assertEquals(-1, dustin.compare(vecna));

	}


	@Test
	void testDustinGanaConMax() {
		assertEquals(1, dustin.compare(max));

	}
	
	@Test
	void testDustinGanaConMike() {
		assertEquals(1, dustin.compare(mike));

	}

	@Test
	void testDustinEmpataConDustin() {
		assertEquals(0, dustin2.compare(dustin));

	}

	// eleven

	@Test
	void testElevenPierdeContraMax() {
		assertEquals(-1, eleven.compare(max));

	}
	
	@Test
	void testElevenPierdeContraMike() {
		assertEquals(-1, eleven.compare(mike));

	}

	@Test
	void testElevenGanaDustin() {
		assertEquals(1, eleven.compare(dustin));

	}
	
	@Test
	void testElevenGanaContraVecna() {
		assertEquals(1, eleven.compare(vecna));

	}

	@Test
	void testElevenEmpataEleven() {

		assertEquals(0, eleven2.compare(eleven));

	}

	// max

	@Test
	void testMaxPierdeDustin() {
		assertEquals(-1, max.compare(dustin));

	}
	
	@Test
	void testMaxPierdeContraMike() {
		assertEquals(-1, max.compare(mike));

	}

	@Test
	void testMaxGanaEleven() {
		assertEquals(1, max.compare(eleven));

	}
	
	@Test
	void testMaxGanaVecna() {
		assertEquals(1, max.compare(vecna));

	}

	@Test
	void testMaxEmpataMax() {
		assertEquals(0, max2.compare(max));

	}
	
	
	// vecna

		@Test
		void testVecnaPierdeMax() {
			assertEquals(-1, vecna.compare(max));

		}
		
		@Test
		void testMaxPierdeContraEleven() {
			assertEquals(-1, vecna.compare(eleven));

		}

		@Test
		void testMaxGanaMike() {
			assertEquals(1, vecna.compare(mike));

		}
		
		@Test
		void testMaxGanaDustin() {
			assertEquals(1, vecna.compare(dustin));

		}

		@Test
		void testVecnaEmpataVecna() {
			assertEquals(0, vecna2.compare(vecna));

		}
		
		// mike

				@Test
				void testMikeaPierdeDustin() {
					assertEquals(-1, mike.compare(dustin));

				}
				
				@Test
				void testMikePierdeContraVecna() {
					assertEquals(-1, mike.compare(vecna));

				}

				@Test
				void testMikeGanaEleven() {
					assertEquals(1, mike.compare(eleven));

				}
				
				@Test
				void testMikeGanaMax() {
					assertEquals(1, mike.compare(max));

				}

				@Test
				void testMikeEmpataMike() {
					assertEquals(0, mike2.compare(mike));

				}

	// max texto

	@Test
	void testMaxTextoEmpata() {
		max.compare(max2);
		assertEquals("max empata con max", max.getDescriptionResult());

	}

	@Test
	void testMaxTextoGana() {
		max.compare(eleven);
		assertEquals("max le gana a eleven", max.getDescriptionResult());

	}

	@Test
	void testMaxTextoPierde() {
		max.compare(dustin);
		assertEquals("max pierde contra dustin", max.getDescriptionResult());

	}

	// dustin

	@Test
	void testDustinTextoGanaMax() {
		dustin.compare(max);
		assertEquals("dustin gana a max", dustin.getDescriptionResult());

	}

	@Test
	void testDustinTextoEmpata() {
		dustin.compare(dustin2);
		assertEquals("dustin empata con dustin", dustin.getDescriptionResult());

	}

	@Test
	void testDustinTextoPierdeEleven() {
		dustin.compare(eleven);
		assertEquals("dustin pierde contra eleven", dustin.getDescriptionResult());

	}

	// eleven

	@Test
	void testElevenTextoPierde() {
		eleven.compare(max);
		assertEquals("eleven pierde contra max", eleven.getDescriptionResult());

	}

	@Test
	void testElevenTextoGana() {
		eleven.compare(dustin);
		assertEquals("eleven le gana a dustin", eleven.getDescriptionResult());

	}

	@Test
	void testElevenTextoEmpata() {
		eleven.compare(eleven2);
		assertEquals("eleven empata con eleven", eleven.getDescriptionResult());

	}

}
