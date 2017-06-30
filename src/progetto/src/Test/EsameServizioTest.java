package Test;

import java.util.Date;

import org.junit.Test;

import Base.BaseTest;
import EsamiOnLine.Esame;
import Servizio.EsameServizio;

public class EsameServizioTest extends BaseTest{
	@Test  
	public void getAllEsame() throws Exception {
		EsameServizio s = new EsameServizio();
		System.out.println("Esami : "+s.getEsami().size());
	}
	@Test  
	public void addEsame() throws Exception {
		try {
			EsameServizio s = new EsameServizio();
			
			s.addEsame(11,"EX11",new Date(),"15:00", new Double(1));System.out.println("Adding esame 11");
			s.addEsame(21,"EX21",new Date(),"08:30", new Double(1));System.out.println("Adding esame 21");
		 
			System.out.println("Esami : "+s.getEsami().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 	}
	}
	@Test  
	public void updateEsame() throws Exception {
		try {
			EsameServizio s = new EsameServizio();
			
			 
			s.updateEsame(21,"EX21",new Date(),"10:30", new Double(2));System.out.println("Updating esame 21");
			System.out.println("Esami : "+s.getEsami().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 	}
	}
	@Test  
	public void deleteEsame() throws Exception {
		try {
			EsameServizio s = new EsameServizio();
			s.deleteEsame(11);System.out.println("Deleting esame 11");
			
			System.out.println("Esami : "+s.getEsami().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}
	@Test  
	public void deleteAllEsame() throws Exception {
		try {
			EsameServizio s = new EsameServizio();
			for(Esame c :s.getEsami()){
			s.deleteEsame(c.getIdentificativo());System.out.println("Deleting esame "+c.getIdentificativo());
			}
			System.out.println("Esami : "+s.getEsami().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}

}
