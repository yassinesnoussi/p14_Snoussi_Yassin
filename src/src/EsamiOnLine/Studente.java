package EsamiOnLine;

import java.util.Date;



public class Studente extends Utente {
	
	/** Attributes */
	private String Identificativo;
	private String nome;
	private String cognome;
	private Date datanascita;
	private Date Anno_insc ;
	
	/** Associations */
	
	private Corso corso ;
	private Esame esame ;
	private StatisticheCorso statistichecorso ;
	private PianoStudio pianostudio ;
	
	

	

	public Studente(String Identificativo, String nome, String cognome, Date datanascita,  Date Anno_insc )
			 {
		super();
		this.Anno_insc = Anno_insc;
		
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
	public Date getAnno_insc() {
		return Anno_insc;
	}

	public void setAnno_insc(Date Anno_insc) {
		this.Anno_insc = Anno_insc;
	}



	
	public  StatisticheCorso getStatisticheCorso() {
		return statistichecorso;
	}

	public void StatisticeCorso(StatisticheCorso  statistichecorso) {
		this.statistichecorso = statistichecorso;
	
	}
		public Esame getEsame() {
			return esame;
		}

		public void setEsame(Esame esame) {
			this.esame = esame;
		}


          public PianoStudio getPianoStudio(){
         return  pianostudio ;
          }
          public void SetPianoStudio (PianoStudio pianostudio)
          {
        	  this.pianostudio = pianostudio ;
          }
		public Corso getCorso() {
			return corso ;
		}

		public void setCorso(Corso corso) {
			this.corso = corso;
		
		
	
		}
		}	
	
