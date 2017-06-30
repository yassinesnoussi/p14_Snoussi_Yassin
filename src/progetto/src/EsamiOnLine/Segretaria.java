package EsamiOnLine;

import java.util.Date;

public class Segretaria {
	
	private Integer Identificativo;
	private String nome;
	private String cognome;
	private Date datanascita;
	
	/** Methods   */
	
	public void aggiunge (){}
	public void cancella (){}
	
	public Segretaria(Integer Identificativo, String nome, String cognome, Date datanascita){
		super();
	this.Identificativo = Identificativo;
	this.nome = nome;
	this.cognome = cognome;
	this.datanascita = datanascita;
		 }
	public Integer getIdentificativo() {
		return Identificativo;
	}

	public void setMatricola(Integer identificativo) {
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

	