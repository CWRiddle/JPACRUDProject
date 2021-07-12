package com.skilldistillery.vst.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SoftsynthTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Softsynth synth;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("VSTPU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		synth = em.find(Softsynth.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		synth = null;
	}

	@Test
	void test() {
		assertNotNull(synth);
		assertEquals("Serum", synth.getName());
		assertEquals("Xfer", synth.getCompany());
		assertEquals(189.00, synth.getPrice());
	}

}
