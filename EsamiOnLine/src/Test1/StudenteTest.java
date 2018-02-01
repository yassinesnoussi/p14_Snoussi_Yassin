package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Model.Esame;
import Model.PianoStudio;
import Model.Prenotazione;
import Model.Studente;




//Test strutturale
public class StudenteTest {
	private static Studente studente = null;
	ArrayList<Esame> esami = new ArrayList<Esame>();
	ArrayList<Prenotazione> prenotazioni= new ArrayList<Prenotazione>();
	private ArrayList<Prenotazione> risultatoattesoprenotazione;
	PianoStudio p = new PianoStudio();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studente = new Studente();
		System.out.println("scrivere  Studente");
	 	
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
	public void testGettersSettersConfermaVoto(){
		studente.setVotoConfermato(true);
		assertTrue("conferma",studente.isVotoConfermato());
		
		
	}
	
	
	
	
	
	@Test
	public void testGettersSettersEsame(){
		
		studente.setEsami(esami);
		ArrayList<Esame> risultatoattestoesame= esami;
		assertEquals(risultatoattestoesame, studente.getEsami());
		
	}
	
	
	
	
	@Test
	public void testGettersSettersPrenotazione (){
		
		
		studente.setPrenotazione(prenotazioni);
		risultatoattesoprenotazione = prenotazioni;
		assertEquals(risultatoattesoprenotazione,studente.getPrenotazione());	
		
		
	}
	
	
	
	
	

	 
	
	
	@Test
	public void testGettersSettersPiano(){
		
		studente.setPiano(p);
		PianoStudio risultatoattesopiano  = p;
		assertEquals(risultatoattesopiano, studente.getPiano());
	}
	
	
	
	
	
	
	@Test
	public void testID() {
		
		studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		assertEquals(true,studente.getID().equals("4127170"));	
		
	
	}
	
	
	
	
  @Test 
  
  public void testNome() {
  
    studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
	assertEquals(true,studente.getNome().equals("yassine"));	
}

  @Test
  public void testCognome() {
	  
	    studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		assertEquals(true,studente.getCognome().equals("snoussi"));	
	}

  @Test
  
  public void testIndirizzo() {
	  
	    studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		assertEquals(true,studente.getIndirizzo().equals("Tunisia"));	
	}
  @Test
  public void testTel() {
	  
	    studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		assertEquals(true,studente.getTel().equals("3888241813"));	
	}

  @Test
  public void testPassword() {
	  
	    studente  = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		assertEquals(true,studente.getPassword().equals("8900"));	
	}

  
  
}