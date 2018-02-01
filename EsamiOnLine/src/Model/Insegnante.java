
package Model ;
import java.util.ArrayList;

import Model.Corso;
import Model.Utente;





/**
 * @author Yassine Snoussi
 * @version 1.8
 * Data 20/11/2017
 */
/**
 * Sottoclasse: Insegnante
 * contiene il stipendio di un insegnante  
 */

public class Insegnante  extends Utente{

	/** Attributes */
	private  String stipendio ;
	
	
	
	/** Association */
	private ArrayList<Corso> Corsi;
	
	 
	


	


	/**
	 * Corstruttore
	 * @param id
	 * @param nome
	 * @param cognome
	 * @param indirizzo
	 * @param tel
	 * @param password
	 */
	public Insegnante(String id, String nome, String cognome, String indirizzo, String tel, String password)
			 {
		super(id, nome, cognome, indirizzo, tel, password);
	
	}

	
	public Insegnante() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @return stipendio
	 */
	public String getStipendio() {
		return stipendio;
	}


	public void setStipendio(String stipendio) {
		this.stipendio = stipendio;
	}



	/**
	 * @return Corsi
	 */
	public ArrayList<Corso> getCorsi() {
		return Corsi;
	}



	/**
	 * @param corsi
	 */
	public void setCorsi(ArrayList<Corso> corsi) {
		Corsi = corsi;
	}













 
 
 
 
 


	
}