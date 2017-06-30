package Test;

import org.junit.Test;

import Base.BaseTest;
import EsamiOnLine.Corso;
import Servizio.CorsoServizio;
 

public class CorsoServizioTest extends BaseTest{
	
	
	
	@Test  
	public void getAllCorso() throws Exception {
		CorsoServizio s = new CorsoServizio();
		System.out.println("Corsi : "+s.getCorsos().size());
	}
	@Test  
	public void addCorso() throws Exception {
		try {
			CorsoServizio s = new CorsoServizio();
			
			s.addCorso(11, "CC11");System.out.println("Adding corso 11");
			s.addCorso(12, "CC12");System.out.println("Adding corso 12");
			s.addCorso(13, "CC13");System.out.println("Adding corso 13");
			s.addCorso(14, "CC14");System.out.println("Adding corso 14");
			System.out.println("Corsi : "+s.getCorsos().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			 	}
	}
	@Test  
	public void updateCorso() throws Exception {
		try {
			CorsoServizio s = new CorsoServizio();
			
			s.updateCorso(11, "C1C11");System.out.println("Updating corso 11");
			
			System.out.println("Corsi : "+s.getCorsos().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 	}
	}
	@Test  
	public void deleteCorso() throws Exception {
		try {
			CorsoServizio s = new CorsoServizio();
			s.deleteCorso(11);System.out.println("Deleting corso 11");
			
			System.out.println("Corsi : "+s.getCorsos().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}
	@Test  
	public void deleteAllCorso() throws Exception {
		try {
			CorsoServizio s = new CorsoServizio();
			for(Corso c :s.getCorsos()){
			s.deleteCorso(c.getIdentificativo());System.out.println("Deleting corso "+c.getIdentificativo());
			}
			System.out.println("Corsi : "+s.getCorsos().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			 		}
	}

}
