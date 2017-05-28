package EsamiOnLine;

import java.util.Date;

public class Docente extends Utente {
	/** Attributes */
	private String Identificativo;
	private String nome;
	private String cognome;
	private Date datanascita;
	private int numero_orario ;
	/** Associations */
	
      


	public Docente(String Identificativo, String nome, String cognome, Date datanascita, int numero_orario) {
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


	
	
	public int getNumero_orario() {
		return numero_orario;
	}

	public void setNumero_orario(int numero_orario ) {
		this.numero_orario = numero_orario ;
	
	
	
	}
	
}


