package Model;

import java.util.ArrayList;

import Model.Corso;
import Model.Studente;



/**
 * @author yassine snoussi
 * @version 1.8
 * Data 20/11/2017
  */
/**
 * Classe :PianoStudio
 * Contiene i corsi  inseriti  al piano di studi di uno studente 
 */

public class PianoStudio {

	/** Attributi  */
     private int Codice;
 
    

	 
	
	
	
	
	


	/** Associazioni */
	public ArrayList<Corso> listaCorsi;
	private  Studente studente;
	
	
	
	
 

	
    /** Costruttore 
     * @param i
     * @param listaCorsi
     */
    public PianoStudio(Studente studente, ArrayList<Corso> listaCorsi) {
		super();
		
		this.studente = studente;
		this.listaCorsi = listaCorsi;
	}


	public PianoStudio() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 * @return listaCorsi
	 */
	public ArrayList<Corso> getListaCorsi() {
		return listaCorsi;
	}


	/**
	 * 
	 * @param listaCorsi
	 */
	public void setListaCorsi(ArrayList<Corso> listaCorsi) {
		this.listaCorsi = listaCorsi;
	}
	    
	

	
	public Studente getStudente() {
		return studente;
	}


	public void setStudente(Studente studente) {
		this.studente = studente;
	}


	/**
	 * @return
	 */
	public int getCodice() {
			return Codice;
		}


		/**
		 * @param codice
		 */
		public void setCodice(int codice) {
			Codice = codice;
		}


	
	
	  
	 
	/**
	 * operazione: addCorso
	 * permette di aggiungere corso alla lista dei corsi in piano di studio
	 * @param c
	 */
	public int addCorso (Corso c) {
		if (listaCorsi.size()<6){
    		listaCorsi.add(c);
		return 1;}
		else
    		return 0;}
    	
	
	


	/**
	 * operazione: removeCorso
	 * operazione permette di cancellare un corso   
	 * @param c
	 */
	public void removeCorso (Corso c )
	{
    	
    		listaCorsi.remove(c);
    	}

	
}
    	 
	
	
	

	 
	
    
   
	
