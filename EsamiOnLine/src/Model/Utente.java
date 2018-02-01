package Model;



/**
 * @author Yassine Snoussi
 * @version 1.8
 * Data 20/11/2017
 */
/**
 * Superclasse: Utente
 * contiene l'ID , il nome , cognome , indirizzo e tel e password di utente (studente/insegnante)
 *
 */
public class Utente {
	/*** Attributi */
	private String ID;
   private String nome ;
   private String cognome ;
   private String Indirizzo ;
   private String Tel ;
   private String password;
 
  

	 

	


	/**
	 * 
	 * @param id
	 * @param nome
	 * @param cognome
	 * @param indirizzo
	 * @param tel
	 * @param password
	 */
	public Utente(String id, String nome, String cognome, String indirizzo, String tel, String password)
	{
	super();
	this.ID = id;
	this.nome = nome;
	this.cognome = cognome;
	this.Indirizzo = indirizzo;
	this.Tel = tel;
	this.password = password;

}
	public Utente() {
		super();
		// TODO Auto-generated constructor stub

		
				
	}


	/**
	 * @return id
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param id
	 */
	public void setID(String id) {
		ID = id;
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
	 * @return cognome
	 */
	public String getCognome() {
		return cognome;
	}
	/**
	 * @param cognome
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	/**
	 * @return indirizzo
	 */
	public String getIndirizzo() {
		return Indirizzo;
	}
	/**
	 * @param indirizzo
	 */
	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}
	/**
	 * @return tel
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * @param tel
	 */
	public void setTel(String tel) {
		Tel = tel;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

    
} 
    
    
    
    
    
      
 

    

