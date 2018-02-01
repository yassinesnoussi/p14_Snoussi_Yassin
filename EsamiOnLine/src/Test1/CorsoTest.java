package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import Model.Corso;
import Model.Esame;
import Model.Prenotazione;








//Test strutturale


public class CorsoTest {
	private static Corso corso = null;
	private String risultatoatteso;
	private Esame risultatoattesoesame;

	
	
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
	     corso= new Corso("80136", "Industrial Automation", "6");
	    	}

	@After
	public void tearDown() throws Exception {
	}

	  
	   @Test
	   
	   public void Testremoveappelloesame () {
		   
		   ArrayList<String> app = new ArrayList<String>();
		   
		app.add("26/01/2018");
		app.add("17/02/2018");
		app.add("01/06/2018");
		app.add("07/07/2018");
		app.add("04/09/2018");
		corso.setListaappelli(app);
		int  risultatoatteso = 0;
		
		 int risultato =corso.removeApelloesame("26/01/2018");
		
		 assertEquals(risultatoatteso,risultato);
	   }
	   
			
		

		
	
	@Test
	public void testGettersSettersCodice() {
		risultatoatteso= "80136";
		corso.setCodice("80136");
		String risultato = corso.getCodice();
		assertEquals(risultatoatteso,risultato);
	 
	  
	 
	}
	@Test
	public void testGettersSettersNome() {
	    risultatoatteso= "Industrial Automation";
		corso.setNome("Industrial Automation");
		String risultato = corso.getNome();
		assertEquals(risultatoatteso,risultato);
	
}
	  
	@Test
	public void testGettersSettersCredito() {
		risultatoatteso= "6";
		corso.setCredito("6");
		String risultato = corso.getCredito();
		assertEquals(risultatoatteso,risultato);
	
	
	}
	

	@Test 
	public void TestGettersSettersEsame (){
		
		
		Corso c = new Corso("80136", "Industrial Automation", "6");
		Esame s = new Esame(0, null,c);
		risultatoattesoesame= s;
		corso.setEsame(s);	
		Esame risultato = corso.getEsame();
		assertEquals(risultatoattesoesame,risultato);
		
		
	}
	

		
		 


	
	
	@Test
public void testNome () {
		Corso c= new Corso("80136", "Industrial Automation", "6");
		ArrayList<String> appello = new ArrayList<String>();
		appello.add("21/06/2017");
		Esame esame = new Esame(0, null, c);
	    ArrayList<Prenotazione> prenotazione = new ArrayList<Prenotazione>();
	    Prenotazione	p = new Prenotazione(5, null, null);
	    prenotazione.add(p);
	    corso= new Corso("80136", "Industrial Automation", "6",appello,prenotazione,esame);
		assertEquals("Industrial Automation",corso.getNome());
	}
	
	 

	
	
	@Test 
	public void testCredito() {
		
		 
		Corso c= new Corso("80136", "Industrial Automation", "6");
		ArrayList<String> appello = new ArrayList<String>();
		appello.add("21/06/2017");
		Esame esame = new Esame(0, null, c);
	    ArrayList<Prenotazione> prenotazione = new ArrayList<Prenotazione>();
	    Prenotazione	p = new Prenotazione(5, null, null);
	     prenotazione.add(p);
	     corso= new Corso("80136", "Industrial Automation", "6",appello,  prenotazione,esame);
		assertEquals("6",corso.getCredito());
	}
		
	
	
	

	@Test
	public void testCodice() {
		Corso c= new Corso("80136", "Industrial Automation", "6");
		ArrayList<String> appello = new ArrayList<String>();
		appello.add("21/06/2017");
		Esame esame = new Esame(0, null, c);
	    ArrayList<Prenotazione> prenotazione = new ArrayList<Prenotazione>();
	    Prenotazione	p = new Prenotazione(5, null, null);
	   prenotazione.add(p);
	    corso= new Corso("80136", "Industrial Automation", "6",appello, prenotazione,esame);
		assertEquals("80136",corso.getCodice());
}

	
	
	
	
	

	
	
	
	
	

	
	
	
	
	@Test
	public void testEsame() {
		Corso c= new Corso("80136", "Industrial Automation", "6");
		ArrayList<String> appello = new ArrayList<String>();
		appello.add("21/06/2017");
		Esame esame = new Esame(0, null, c);
	    ArrayList<Prenotazione> prenotazione = new ArrayList<Prenotazione>();
	    Prenotazione	p = new Prenotazione(5, null, null);
	   prenotazione.add(p);
	    corso= new Corso("80136", "Industrial Automation", "6",appello, prenotazione,esame);
		assertEquals(esame,corso.getEsame());
}

	
}	
			
	



	
	
