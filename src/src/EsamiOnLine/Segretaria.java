package EsamiOnLine;

import java.util.Date;

public class Segretaria extends Utente{
	
	private String Identificativo;
	private String nome;
	private String cognome;
	private Date datanascita;
	
	/** Methods   */
	
	public void aggiunge (){}
	public void cancella (){}
	
	public Segretaria(String Identificativo, String nome, String cognome, Date datanascita){
		super();
	this.Identificativo = Identificativo;
	this.nome = nome;
	this.cognome = cognome;
	this.datanascita = datanascita;
		 }
	public String getMatricola() {
		return Identificativo;
	}

	public void setMatricola(String identificativo) {
		this.Identificativo = identificativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getDatanascita() {
		return datanascita;
	}

	public void setDatanascita(Date datanascita ) {
		this.datanascita = datanascita;
	
	}
	}

		