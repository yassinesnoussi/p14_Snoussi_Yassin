package Test2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Corso;
import Model.PianoStudio;


public class CompilaPiano {
	ArrayList<Corso> c = new ArrayList<Corso>();
	private static PianoStudio piano = null;
	

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
//Test caso d'uso compila il piano di studio
// il scenario principale 
	@Test
	public void testaddCorso () {

		Corso corso1 = new Corso ("80136", "Industrial Automation", "6");
		Corso corso2 = new Corso ("80100", "Computer Securrity", "9");
		Corso corso3 = new Corso ("80456", "Software engeenering", "6");
		Corso corso4 = new Corso ("80256", "data warehouse and dat mining", "9");
		Corso corso5 = new Corso ("80150", "Computer graphics", "6");
		Corso corso6 = new Corso ("80102", "opertaions research", "6");
	
		c.add(corso1);
		c.add(corso2);
		c.add(corso3);
		c.add(corso4);
		c.add(corso5);
		
		piano.setListaCorsi(c);
		int risultatoatteso= 1;
		 int risultato  =  piano.addCorso(corso6);
		assertEquals(risultatoatteso, risultato);
		}
	
	
	
	
	
	
	
		
}

	
	
	
	
	
	
	
	
	
	
