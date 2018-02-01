package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Insegnante;
import Model.Corso;

//Test strutturale

public class InsegnanteTest {
	private static Insegnante insegnante =null;
	ArrayList<Corso> c = new ArrayList<Corso>();
	private ArrayList<Corso> risultatoatteso;
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		insegnante = new Insegnante();
		System.out.println("scrivere Insegnante");
		
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
	public void tetGetttersSettersCorsi() {
		
		Corso corso= new Corso ("80100", "Computer Security", "9");
		c.add(corso);
		insegnante.setCorsi(c);
		risultatoatteso= c;
		ArrayList<Corso> risultato = insegnante.getCorsi();
		assertEquals(risultatoatteso, risultato);
		
	}
	@Test
	public void GetttersSettersStipendio(){
		
		String risultatoatteso= "2100";
		insegnante.setStipendio("2100");
		String risultato = insegnante.getStipendio();
		assertEquals(risultatoatteso,risultato);
	 
	
		
	 	
		
	}
	
	
	
	
	
	
	 
	@Test
	public void testID() {
		insegnante= new Insegnante("I1","Paulo","Pinceti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getID().equals("I1"));	
	}
 
	@Test
	public void testNome() {
		insegnante= new Insegnante("I1","Paulo","Pinceti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getNome().equals("Paulo"));	
	}

	@Test
	public void testCognome() {
		insegnante= new Insegnante("I1","Paulo","Pinceti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getCognome().equals("Pinceti"));	
	}
	
	

	@Test
	public void testIndrizzo() {
		insegnante= new Insegnante("I1","Paulo","Pinceti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getIndirizzo().equals("Italia"));	
	}
	
	@Test
	public void tesTel() {
		insegnante= new Insegnante("I1","Paulo","Pinceti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getTel().equals("3788958476"));	
	}
	
	

	@Test
	public void testPassword() {
		insegnante= new Insegnante("I1","Paulo","Picenti","Italia","3788958476","Paulo22");
		assertEquals(true,insegnante.getPassword().equals("Paulo22"));	
	}
	
	
	

	
 
	
	
	
	
	
}
