package Test2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Model.Esame;
import Model.Studente;
//Test funzionale

 
public class TestStatoVoto {
	
	Studente s;
	
	private static Esame esame = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		esame = new Esame(0,null,null);
		System.out.println("scrivere Esame");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	
	//test del caso d'uso  accettare voto  
	// ho pensato che il studente  conferma (accetta) il voto 24 (abbiamo 24 > 18 e operazione s.ConfermaVoto ()==true)

	public void testStatoVotoConferma() {
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",true);
		esame.setStudente(s);
		boolean risultato = esame.isStatoVoto(24);
		assertTrue(" Conferma", risultato );
	
	}
	
	
	
	// test Caso d'uso rifiutare voto 
	// ho pensato che il studente non conferma(rifiuta) il voto 24 (abbiamo 24 > 18 e operazione s.ConfermaVoto ()==false)
	
	@Test
	public void testStatoVotoNonconferma() {
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		esame.setStudente(s);
		boolean risultato = esame.isStatoVoto(24);
		assertFalse(" Non conferma", risultato );
  }
}
	
	
	
	

