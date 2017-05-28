package EsamiOnLine;

import java.util.Date;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Date data= new Date (20/11/2017); // La data di inscrizione di un studente
	       Date datanasc = new Date (15/01/1991); // la data di nascita di studente
	       Date datanascd = new Date (20/01/1975);// la data di nascita di docente
	       Date datanascS = new Date (21/06/1885);// la data di nascita di segretaria 
	       Date dataapello= new Date (28/06/2017); // la data di apello di esame 
	      
	       // inserisco i dati 
		 
		Studente Luca = new Studente("3491478","luca","Patti", datanasc,data);
		Docente Aless = new Docente ("1","Alessandro","Armando",datanascd,36);
	    Segretaria Segr = new Segretaria ( "072" ,"Barabara","Fornetti",datanascS );
		Corso corso = new Corso ("2","Computer Security");
		Esame esame = new Esame (23,dataapello);
		PianoStudio Piano = new PianoStudio (5,"Industrial Automation");
		StatisticheCorso Statistiche = new StatisticheCorso (23,42.5);
		
		
		
	}

}
