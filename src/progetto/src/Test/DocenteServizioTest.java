package Test;

import java.util.Date;

import org.junit.Test;

import Base.BaseTest;
import EsamiOnLine.Docente;
import Servizio.DocenteServizio;

public class DocenteServizioTest extends BaseTest{
	@Test  
	public void getAllDocente() throws Exception {
		DocenteServizio s = new DocenteServizio();
		System.out.println("Docenti : "+s.getDocentes().size());
	}
	@Test  
	public void addDocente() throws Exception {
		try {
			DocenteServizio s = new DocenteServizio();
			
			s.addDocente(1, "Mr ABC 1",new Date());System.out.println("Adding docente 1");
			s.addDocente(2, "Mme BCG ",new Date());System.out.println("Adding docente 2");
			 
			System.out.println("Docente : "+s.getDocentes().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 	}
	}
	@Test  
	public void updateDocente() throws Exception {
		try {
			DocenteServizio s = new DocenteServizio();
			
			s.updateDocente(1, "Mr ABC ",new Date());System.out.println("Updating insegnante 1");
			
			System.out.println("Docente : "+s.getDocentes().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 	}
	}
	@Test  
	public void deleteDocente() throws Exception {
		try {
			DocenteServizio s = new DocenteServizio();
			s.deleteDocente(11);System.out.println("Deleting docente 11");
			
			System.out.println("Docenti : "+s.getDocentes().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}
	@Test  
	public void deleteAllDocente() throws Exception {
		try {
			DocenteServizio s = new DocenteServizio();
			for(Docente c :s.getDocentes()){
			s.deleteDocente(c.getIdentificativo());System.out.println("Deleting docente "+c.getIdentificativo());
			}
			System.out.println("Docente : "+s.getDocentes().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}

}

