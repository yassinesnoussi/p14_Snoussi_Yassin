package EsamiOnLine;



public class PianoStudio {

	
	/** Attributes */
private int Identificativo;
private String nomecorso;
	
	
	/** Associations */
	private Studente studente;
	private Corso corso ;
	
	public PianoStudio() {
		super();
	}

	public PianoStudio(int Identificativo , String nomecorso) {
		super();
		this.Identificativo = Identificativo;
		this.nomecorso = nomecorso;
	}

	public int getIdentificativo() {
		return Identificativo;
	}
	public String getNome() {
		return nomecorso;
	}

	public void setNome(String nome) {
		this.nomecorso = nome;
	}
	public void setIdentificativo(int Identificativo) {
		this.Identificativo = Identificativo;
	}

	


	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	
	
	
	}
	
		public Corso getCorso() {
			return corso ;
		}

		public void setCorso(Corso corso) {
			this.corso = corso;
		
		}}