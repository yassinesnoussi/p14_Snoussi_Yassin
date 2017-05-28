package EsamiOnLine;

public class Corso extends PianoStudio {
	
	/** Attributes */
	private String Identifcorso;
	private String nomecorso;

	
	/** Associations */
	private Esame esame;
	private Studente studente; 
	private Docente docente ;
	private StatisticheCorso statistichecorso;
	
	


	public Corso(String Identifcorso, String nomecorso) {
		super();
		this.Identifcorso = Identifcorso;
		this.nomecorso = nomecorso;
		
		
	}

	public String getNome() {
		return nomecorso;
	}

	public void setNome(String nome) {
		this.nomecorso = nome;
	}


	


	

	public void setIdentifcorso(String Identifcorso) {
		this.Identifcorso = Identifcorso;
	}


	public String getIdentifcorso() {
		return Identifcorso;
	}





public Studente getStudente() {
	return studente;
}

public void setStudente(Studente studente) {
	this.studente = studente;
}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
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
	
	}
	
	
/**
 * Operation
 *
 * @param ore
 * @return 
 */	

	

