package Model;

import java.util.ArrayList;





/**
 * @author Yassine Snoussi 
 * @version 1.8
 * Data 20/11/2017
 */
/**
 * Classe:Corso
 * contiene il codice ,il nome e il credito e el la lista dei appelli 
 */
public class Corso {
	
    /** Attributes */
    private String codice;
    private String nome;
    private String credito;
    private ArrayList<String> listaappelli;
   
    /** Associations */
  
    private ArrayList<Prenotazione> prenotazione;
	private Esame esame;
    
 
 











    /**
     * @param codice
     * @param nome
     * @param credito
     * @param listaappelli
     * @param prenotazione
     * @param esame
     */
    public Corso(String codice, String nome, String credito, ArrayList<String> listaappelli,
			ArrayList<Prenotazione> prenotazione, Esame esame) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.credito = credito;
		this.listaappelli = listaappelli;
		this.prenotazione = prenotazione;
		this.esame = esame;
	}





	public Corso(String codice, String nome, String credito) {
   	this.codice=codice;
    this.nome=nome;
   	this.credito=credito;
    	
   } 
	




	public Corso() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return codice
	 */
	public String getCodice() {
		return codice;
	}





	/**
	 * @param codice
	 */
	public void setCodice(String codice) {
		this.codice = codice;
	}


 

	/**
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

 


	/**
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}




	/**
	 * @return  credito
	 */
	public String getCredito() {
		return credito;
	}




	/**
	 * @param credito
	 */
	public void setCredito(String credito) {
		this.credito = credito;
	}











	/**
	 * @return esame
	 */
	public Esame getEsame() {
		return esame;
	}




	/**
	 * @param esame
	 */
	public void setEsame(Esame esame) {
		this.esame = esame;
	}





	/**
	 * @return listaappelli
	 */
	public ArrayList<String> getListaappelli() {
		return listaappelli;
	}





	/**
	 * @param listaappelli
	 */
	public void setListaappelli(ArrayList<String> listaappelli) {
		this.listaappelli = listaappelli;
	}





	/**
	 * @return prenotazione
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
	 * @param data
	 * @return
	 * operazione permette di aggiungere un appello esame  che contiene la data di un appello
	 */
	public int addAppelloesame(String data) {
    	if(listaappelli.size()<3){
    		listaappelli.add(data);
    		return 1;
    	}
    	else {
    		return 0;}
    	}	
      	


	/**
     * @param data
     * operazione permette di cnacellare un appello  esame  che contiene data di  un appello
     * @return 
	 */
     
	
    public  int removeApelloesame(String data ) {
    	
    		if (listaappelli.size()<=3){
    		listaappelli.remove(data);
    		return 1;}
    		else {
    			return 0;
    			
    			
}   
   }	
	
	}

 

  

