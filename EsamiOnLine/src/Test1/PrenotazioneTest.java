package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Corso;
import Model.Prenotazione;
import Model.Studente;


// test strutturale 
 
 


public class PrenotazioneTest {
	
	Studente studente = new Studente ();
	Corso corso = new Corso();
	 Prenotazione p ;
	 //private int risultatopre;
	 ArrayList<Prenotazione> pre =new ArrayList<Prenotazione>();
	private int risultatoatteso;
	
	private static Prenotazione prenotazione = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		prenotazione= new Prenotazione();
		System.out.println("scrivere Prenotazione");
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
	public void testSetttersGettersStudente() {
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		prenotazione.setStudente(s);
		Studente risultatoatteso = s;
		assertEquals(risultatoatteso,prenotazione.getStudente());
	}

		
	
	
	
	
	@Test
	public void testSettersGettersCorso() {
		Corso c = new Corso("80100", "Computer Security", "9");
		prenotazione.setCorso(c);
		Corso risultatoatteso = c;
		assertEquals(risultatoatteso, prenotazione.getCorso());
	}
	
	@Test
	public void testSettersGettersCodice() {
		prenotazione.setCodice(5);
		risultatoatteso= 5;
		assertEquals(risultatoatteso, prenotazione.getCodice());
	}
	@Test 
	public void testCodice() {
	
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso c = new Corso("80100", "Computer Security", "9");
		prenotazione = new Prenotazione(5, s ,c);
		assertEquals(5, prenotazione.getCodice());
	}

	
	@Test 
	public void testStudente() {
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso c = new Corso("80100", "Computer Security", "9");
		
		prenotazione= new Prenotazione(5, s ,c);
		
		assertEquals(s, prenotazione.getStudente());
	
	
	}
	
	
	@Test 
	public void testCorso() {
		Studente s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso c = new Corso("80100", "Computer Security", "9");
		prenotazione= new Prenotazione(5, s ,c);
		assertEquals(c, prenotazione.getCorso());
	
	
	}
	
	
	
	}
		

       

     
   




	
