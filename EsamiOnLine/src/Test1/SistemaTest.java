package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Utente;

import Model.Corso;

import Model.PianoStudio;
import Model.Prenotazione;
import Model.Sistema;
import Model.Studente;
//Test strutturale
public class SistemaTest {
	
	ArrayList<Prenotazione> prenotazione = new ArrayList<Prenotazione>();
	ArrayList<PianoStudio>  piano = new ArrayList<PianoStudio>();
	private static Sistema sistema = null ;
	
	ArrayList<Utente> utente = new ArrayList<Utente>();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		sistema = new Sistema();
		System.out.println("scrivere Sistema");
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
	public void testGettersSettersUtente() {

		Utente ut = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
		 utente.add(ut);
         sistema.setUtente(utente);
         assertEquals(true, sistema.getUtente().equals(utente));
	}
 
	@Test 
	public void testGettersSettersPrenotazione() {
		
     Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
      Corso corso = new Corso("80136", "Industrial Automation", "6");
	
	Prenotazione pre = new Prenotazione(0, studente,corso);
	prenotazione.add(pre);
		sistema.setPrenotazionecorsi(prenotazione);
		assertEquals(prenotazione, sistema.getPrenotazionecorsi());
	}
 

	
	
	 
	
	@Test	
public void testGettersStettersPianostudio () {
		Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso corso = new Corso("80136", "Industrial Automation", "6");
		ArrayList<Corso> corsi = new ArrayList<Corso>();
		corsi.add(corso);
		PianoStudio c = new PianoStudio(studente, corsi);
		piano.add(c);
		sistema.setPianostudio(piano);
		assertEquals(piano, sistema.getPianostudio());
}
	
		
	 
	@Test
	 public void testPrenotazione() {
	
	Studente studente = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		Corso corso = new Corso("80136", "Industrial Automation", "6");
		Prenotazione pre = new Prenotazione(0, studente,corso);
		prenotazione.add(pre);
		sistema.setPrenotazionecorsi(prenotazione);
		assertEquals(prenotazione, sistema.getPrenotazionecorsi());
}	




	






}


