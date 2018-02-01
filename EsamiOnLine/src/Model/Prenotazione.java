package Model;

/**
 * @author Yassine Snoussi
 * @version 1.8
 * Data 20/11/2017
  */
/**
 * Classe: Prenotazione
 * contiene il codice di prenotazione di corso 
 *
 */
public class Prenotazione {
	
	/** Attributes */
	private int codice;
  
	/** Associations */
	
	private Studente studente;
	private Corso corso;

 

	
	
	/**
	 * @param codice
	 * @param studente
	 * @param corso
	 * @param appello
	 */
	public Prenotazione(int codice, Studente studente, Corso corso) {
		super();
		this.codice = codice;
		this.studente = studente;
		this.corso = corso;
		
	}

	
	public Prenotazione() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


   /**
	 * @return
	 */
	public int getCodice() {
		return codice;
	}
	/**
	 * @param codice
	 */
	public void setCodice(int codice) {
		this.codice = codice;
	}
	/**
	 * @return
	 */
	public Studente getStudente() {
		return studente;
	}
	/**
	 * @param studente
	 */
	public void setStudente(Studente studente) {
		this.studente = studente;
	}
	/**
	 * @return
	 */
	public Corso getCorso() {
		return corso;
	}
	/**
	 * @param corso
	 */
	public void setCorso(Corso corso) {
		this.corso = corso;
	
	}
	
	


	

}

	
