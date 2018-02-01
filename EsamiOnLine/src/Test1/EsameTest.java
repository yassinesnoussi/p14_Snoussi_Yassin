package Test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Corso;
import Model.Esame;

import Model.Studente;

//Test strutturale
public class EsameTest {
	 
	
	Studente studente;
	private static Esame esame = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		esame = new Esame(0, null, null);
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
	public void testStatoVotoconfermatrue() {
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",true);
		esame.setStudente(studente);
		boolean risultato = esame.isStatoVoto(30);
		assertTrue("conferma", risultato );

		
}	

	
	@Test
	public void testStatoVotononconfermatrue() {
		
	
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",true);
		esame.setStudente(studente);
		boolean risultato = esame.isStatoVoto(16);
		assertFalse("non conferma", risultato );
	
}
	

	
	
		
	
	@Test
	public void testGettersSettersVoto() {
		esame.setVoto(28);
		int risultato = esame.getVoto();
		assertEquals(28, risultato);
	}
	
 
	
	@Test
	public void testGettersSettersCorso() {
		

		Corso c = new Corso("80136", "Industrial Automation", "6");
		esame.setCorso(c);
		assertEquals(c, esame.getCorso());;
		
	}
	
	
	
	@Test
	
	public void testVoto() {
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso  corso= new Corso("80136", "Industrial Automation", "6");
		esame = new Esame(28,studente,corso);
		assertEquals(28, esame.getVoto());
}
	
	

	@Test
	public void testStudente() {
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso  corso= new Corso("80136", "Industrial Automation", "6");
		esame = new Esame(28, studente,corso);
		assertEquals(studente, esame.getStudente());
	}

	
	@Test
	public void testCorso() {
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso  corso= new Corso("80136", "Industrial Automation", "6");
		esame = new Esame(28,studente,corso);
		assertEquals(corso, esame.getCorso());
	}
	
}