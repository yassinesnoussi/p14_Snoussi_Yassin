package Test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Utente;


public class UtenteTest {
	private static Utente utente = null;
	private String risultatoatteso;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		utente = new Utente();
		System.out.println("scrivere Utente ");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");	
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void tesID() {
		utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
		assertEquals(true,utente.getID().equals("4127170"));
		
		
		
		
		
	}
	@Test
	public void testNome() {
		utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
		assertEquals(true,utente.getNome().equals("yassine"));
	}	
@Test
	public void testCognome() {
	utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
	assertEquals(true,utente.getCognome().equals("snoussi"));
	
	}
	
	 
	@Test

	public void testIndirizzo() {
	utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
	assertEquals(true,utente.getIndirizzo().equals("Tunisia"));
	
	}
	
	@Test
	
	public void testTel() {
		utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
		assertEquals(true,utente.getTel().equals("3888241813"));
		
		}
	
	@Test
	public void testPassword() {
		utente  = new Utente("4127170","yassine","snoussi","Tunisia","3888241813","8900");
		assertEquals(true,utente.getPassword().equals("8900"));
		
		}
	

	
	
	
	@Test
	public void testGettersSettersID() {
		utente.setID("4127170");
		risultatoatteso = "4127170";
		assertEquals(risultatoatteso, utente.getID());
	}
	
	@Test
	
	public void testGettersSettersNome() {
		utente.setNome("yassine");
		risultatoatteso = "yassine";
		assertEquals(risultatoatteso, utente.getNome());
	}
	
	 
	@Test
	
	public void testGettersSettersCognome() {
		utente.setCognome("snoussi");
		risultatoatteso = "snoussi";
		assertEquals(risultatoatteso, utente.getCognome());
	}
	
@Test
	public void testGettersSettersIndirizzo() {
		utente.setIndirizzo("Tunisia");
		risultatoatteso = "Tunisia";
		assertEquals(risultatoatteso, utente.getIndirizzo());
	}
	
@Test
	public void testGettersSettersTel() {
		utente.setTel("3888241813");
		risultatoatteso = "3888241813";
		assertEquals(risultatoatteso, utente.getTel());
	}
	
	
	
	@Test

	public void testGettersSettersPassword() {
		utente.setPassword("8900");
		risultatoatteso = "8900";
		assertEquals(risultatoatteso, utente.getPassword());
	}
	
	

	
	
	
	
	
	 
	
	
}



