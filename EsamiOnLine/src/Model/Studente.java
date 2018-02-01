package Model;

import java.util.ArrayList;

import Model.PianoStudio;

import Model.Utente;




/**
 * @author Yassine Snoussi
 * @version 1.8
 * Data 20/11/2017
  */
/**
 * Sottoclasse: Studente
 * contiene il voto confermato di studente 
 *
 */
public class Studente extends Utente {
	
	/** Attributes */
	
	private boolean VotoConfermato;		
	
	
	/** Associations */
	private ArrayList<Prenotazione> prenotazione;
	private PianoStudio Piano;
	private ArrayList<Esame> esamipassati;

		
	

	
	
	



	/**
	 * Costruttore con parametri
	 * @param id
	 * @param nome
	 * @param cognome
	 * @param indirizzo
	 * @param tel
	 * @param password
	 * @param VotoConfermato
	 */
	public Studente(String id, String nome, String cognome, String indirizzo, String tel, String password, boolean VotoConfermato) {
		super(id, nome, cognome, indirizzo, tel, password);
		this.VotoConfermato = VotoConfermato ;
		
	}
	

	public Studente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	/**
	 * @return
	 */
	public boolean isVotoConfermato() {
		return VotoConfermato;
	}

	
	/**
	 * @param votoConfermato
	 */
	public void setVotoConfermato(boolean votoConfermato) {
		VotoConfermato = votoConfermato;
	}
	

	/**
	 * @return
	 */
	public ArrayList<Esame> getEsami() {
		return esamipassati;
	}


	/**
	 * @param esamipassati
	 */
	public void setEsami(ArrayList<Esame> esamipassati) {
		this.esamipassati = esamipassati;
	}

	
	
	
	
		/**
		 * @return
		 */
		public ArrayList<Prenotazione> getPrenotazione() {
		return prenotazione;
	}
	
	/**
	 * @param prenotazione
	 */
	public void setPrenotazione(ArrayList<Prenotazione> prenotazione) {
		this.prenotazione = prenotazione;
	}
	
	/**
	 * @return
	 */
	public PianoStudio getPiano() {
		return Piano;
	}
	
	/**
	 * @param piano
	 */
	public void setPiano(PianoStudio piano) {
		Piano = piano;
	}
	
	
	
   

}