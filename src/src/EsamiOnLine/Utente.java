package EsamiOnLine;

import java.util.Date;

public class Utente {
	private String Identificativo;
	private String nome;
	private String cognome;
	private Date datanascita;
	


 

public Utente()
		 {
	super();
	
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
	
	}}