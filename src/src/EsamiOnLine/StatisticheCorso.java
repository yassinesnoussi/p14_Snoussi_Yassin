package EsamiOnLine;


public class StatisticheCorso {
	
    /** Attributes */
	private double Media ;
	private double  Frequenza;
	
	/** Associations */
	private Segretaria segretaria;
	private Docente docente ;
	private Studente studente ;
	private Corso corso ;
	
	public StatisticheCorso() {
		super();
	}

	public StatisticheCorso (double Media, double Frequenza ) {
		super();
		
		
		this.Media = Media;
		this.Frequenza = Frequenza;
		
	}
	
	
	
	public double getMedia() {
		return Media;
	}

	public void setMedia(int Media) {
		this.Media = Media;
	}

	public double getFrequenza() {
		return Frequenza;
	}

	public void setFrequenza(int Frequenza) {
		this.Frequenza = Frequenza;
	}
	
	
	public Segretaria getSegretaria() {
		return segretaria ;
	}

	public void setSegretaria(Segretaria segretaria) {
		this.segretaria = segretaria;
	
	}

    public Docente getDocente() {
       return docente;
}
   public void setDocente(Docente docente) {
      this.docente = docente ;
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



}
	
	}