package Test;

import org.junit.Test;

import Base.BaseTest;
import EsamiOnLine.Corso;
import EsamiOnLine.Docente;
import EsamiOnLine.Programma;
import Servizio.CorsoServizio;
import Servizio.DocenteServizio;
import Servizio.ProgrammaServizio;

public class ProgrammaServizioTest extends BaseTest {
	@Test
	public void getAllProgramma() throws Exception {
		ProgrammaServizio s = new ProgrammaServizio();

		System.out.println("Programmi : " + s.getProgrammi().size());
	}

	@Test
	public void addProgramma() throws Exception {
		try {
			CorsoServizio co = new CorsoServizio();
			ProgrammaServizio s = new ProgrammaServizio();
			DocenteServizio i = new DocenteServizio();
// adding programma
			s.addProgramma(13, "P0013", 2017);
			System.out.println("Adding programma 13");
			//adding corso to progarama
			Programma p = s.getProgramma(13);
			Docente i01 = i.getDocente(1);
			Corso c11 = co.getCorso(11);
			s.addCorso(c11.getIdentificativo(), p.getIdentificativo(), i01.getIdentificativo(), new Double(60), new Integer(1));
			s.addProgramma(14, "P00114", 2017);
			System.out.println("Adding programma 14");
			System.out.println("Programmas : " + s.getProgrammi().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	@Test
	public void updateProgramma() throws Exception {
		try {
			ProgrammaServizio s = new ProgrammaServizio();

			s.updateProgramma(14, "P0014", 2017);
			System.out.println("Updating programma 14");

			System.out.println("Programmi : " + s.getProgrammi().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	@Test
	public void deleteProgramma() throws Exception {
		try {
			ProgrammaServizio s = new ProgrammaServizio();
			s.deleteProgramma(14);
			System.out.println("Deleting programma 14");

			System.out.println("Programmi : " + s.getProgrammi().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

	@Test
	public void deleteAllProgramma() throws Exception {
		try {
			ProgrammaServizio s = new ProgrammaServizio();
			for (Programma c : s.getProgrammi()) {
				s.deleteProgramma(c.getIdentificativo());
				System.out.println("Deleting programma " + c.getNome());
			}
			System.out.println("Programmi : " + s.getProgrammi().size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}

}
