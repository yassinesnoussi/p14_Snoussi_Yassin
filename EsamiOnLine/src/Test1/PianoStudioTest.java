package Test1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.PianoStudio;
import Model.Corso;
import Model.Studente;




 

//Test strutturale
 


public class PianoStudioTest {
	ArrayList<Corso> c = new ArrayList<Corso>();
	private static PianoStudio piano = null;
	private ArrayList<Corso> risultatoatteso;
	private int risultatoattesocod;
	private Studente risultatoattesoStudente;
	Studente s;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		
		piano= new PianoStudio();
		System.out.println("scrivere PianoStudio");
		
		
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
		public void testremoveCorso () {
			
			Corso corso = new Corso ("80100", "Computer Security", "9");
			c.remove(corso);
			risultatoatteso= c;
			piano.setListaCorsi(c);
			  piano.removeCorso(corso);
			assertEquals(risultatoatteso, piano.getListaCorsi());
			
		}	
	
	
	@Test
	public void testGettersSettersCoidcePiano(){
		
			piano.setCodice(5);
			risultatoattesocod= 5;
			assertEquals(risultatoattesocod, piano.getCodice());
			
	}
	

 
	@Test
	
	public void testGettersSettersStudente () {
		
		s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		piano.setStudente(s);
		Studente risultato1 = piano.getStudente();
		risultatoattesoStudente= s;
		assertEquals(risultatoattesoStudente,risultato1);
		
	
	}
	@Test
	public void testGettersSettersCorso () {
		
		Corso corso = new Corso ("80100", "Computer Security", "9");
		c.add(corso);
		piano.setListaCorsi(c);	
		ArrayList<Corso> risultato =piano.getListaCorsi();
		risultatoatteso= c;
		assertEquals(risultatoatteso,risultato);
		
	}
	
	

	
	
	

	

	@Test
	public void testCorso(){
		
		
		
		Corso corso = new Corso ("80154", "Software Engineering", "9");
		s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		c.add(corso);
		piano = new PianoStudio(s,c);	
		assertEquals(c,piano.getListaCorsi());		
		
	}
	
	
	
	 
	 
	
	
	@Test
	public void testStudente() {
	
		Corso corso = new Corso ("80154", "Software Engineering", "9");
		s = new Studente("4127170","yassine","snoussi","Tunisia","3888241813","8900",false);
		c.add(corso);
		piano = new PianoStudio(s,c);	
		assertEquals(s,piano.getStudente());	
	}



}
