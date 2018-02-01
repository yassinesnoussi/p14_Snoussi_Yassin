package Test2;

import static org.junit.Assert.*;

//import java.io.BufferedReader;
//import java.io.FileReader;
import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Utente;

import Model.Sistema;

//Test funzionale
public class TestAutenticarsi {
	


	ArrayList<Utente> utente = new ArrayList<Utente>();
	private static Sistema sistema = null ;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sistema = new Sistema();
		System.out.println("scrivere  Sistema");
			
	} 

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
 
	@Before
	public void setUp() throws Exception {
		
			
		Utente studente = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
	    utente.add(studente);
	      sistema.setUtente(utente);
	
	}
	
	

	@After
	public void tearDown() throws Exception {
	}

	//Test del caso d'uso Autentiticarsi (le operazione ControllaID e  ControllaPassword) 
	
	
	//Test secnario principale  (id/password  corrette)
	@Test
	public void	 testScenarioPrincipale3IDStudenteCorrette() {
		
		assertEquals(0,sistema.ControllaID("4127170"));
		assertEquals (0, sistema.ControllaPassword("4127170", "8900"));	
		
		}
		
	
//Test scenario alternativo 3a (id falsa)
	
	@Test
	public void testScenarioalternativo3aIDFalsa() {
	assertEquals(-1,sistema.ControllaID("jjj"));
	}
	
		
// Test scenario alternativo 5a(password falsa)

	@Test
		public void testScenarioalternativo5aStudentePaswordFalsa() {
		assertEquals(-1,sistema.ControllaPassword("4127170", "89"));	
		}
		


			
	

	
	
	
	



 
}