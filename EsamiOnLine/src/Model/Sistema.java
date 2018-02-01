package Model;

import java.util.ArrayList;

import Model.PianoStudio;



/**
 * @author yassine snoussi 
 * @version 1.8 
 * Data 20/11/2017
 * */
/**
 * Classe: Sistema
 *   
 * contiene le funzione che permettono di controllare  ID e Password (autenticarsi )
 * contiene la lista di prenotazioni corsi da uno studente ,la lista utenti (studente,insegnante),la lista di piani 
 *  
 */





public class Sistema {
	
	
	/** Association **/
	private ArrayList<Utente> utente = new ArrayList<Utente>(); 
	private ArrayList<Prenotazione> prenotazionecorsi =new ArrayList<Prenotazione>();	
	private ArrayList<PianoStudio> pianostudio=new ArrayList<PianoStudio>(); 

	

	

	

 

	

	public Sistema() {
		super();
		utente = new ArrayList<Utente>(); 
		prenotazionecorsi =new ArrayList<Prenotazione>();
		pianostudio=new ArrayList<PianoStudio>();
	}

	
	
	
	
	
	
	/**
	 * @return
	 */
	public ArrayList<Prenotazione> getPrenotazionecorsi() {
		return prenotazionecorsi;
	}

	/**
	 * @param prenotazionecorsi
	 */
	public void setPrenotazionecorsi(ArrayList<Prenotazione> prenotazionecorsi) {
		this.prenotazionecorsi = prenotazionecorsi;
	}

	/**
	 * @return utente
	 */
	public ArrayList<Utente> getUtente() {
		return utente;
	}
	
	/**
	 * @param utente
	 */
	public void setUtente(ArrayList<Utente> utente) {
		this.utente=utente;
	}
	
	
	
	
	
	


/**
	 * @return pianostudio
	 */
	public ArrayList<PianoStudio> getPianostudio() {
		return pianostudio;
	}

	/**
	 * @param pianostudio
	 */
	public void setPianostudio(ArrayList<PianoStudio> pianostudio) {
		this.pianostudio = pianostudio;
	}

	
	/**
	 * @param id
	 * @return
	 */
	public int ControllaID(String id  ) {
		 boolean esisteid =false ; int idnellista =0;int st_ins=0; int i;
		 for ( i=0; i < utente.size(); i++) {
		if (utente.get(i).getID().equals(id) && id.length()==7 ) {	st_ins= 1; esisteid =true;idnellista=i;}
		else if (utente.get(i).getID().equals(id) &&id.length()==2) {st_ins= 0;esisteid = true;idnellista=i ;}}
		 if (esisteid==true && st_ins==1 ) {  	return idnellista;}
         else  if (esisteid==true && st_ins==0 ) {return  idnellista;}
	     else {return -1;}} 

 

/**
 * @param id
 * @param password
 * @return
 */
public int ControllaPassword(String id, String password) {
	int I = ControllaID(id);	
	if (ControllaID(id)>=0) {
		if (utente.get(I).getPassword().equals(password)){return I;}
		else {return -1;}} 
	else{return -1;}}	
}

	

	
