package Test2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Corso;

//Test Funzionale

public class TastPubblicaAppelloesame {
	private static Corso corso = null;

    ArrayList<String> ap= new ArrayList <String>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		corso = new Corso();
		System.out.println("scrivere Corso");
		
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
	
	
	//Test caso d'uso pubblica appello esame 
	//Test scenario principale 
	
	@Test 
	public void Testaddappelloesame () {
		
		ArrayList<String> app = new ArrayList<String>();
		app.add("17/01/2018");
		corso.setListaappelli(app);	
		int risultatoattesoappello = 1;
		 int risultato = corso.addAppelloesame("05/05/2017");
		assertEquals(risultatoattesoappello, risultato);
	}	

		
}	 
   

		
	
	 
 
	
	
	
	
	 

	


