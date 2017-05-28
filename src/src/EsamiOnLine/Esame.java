package EsamiOnLine;

import java.util.Date;


public class Esame  {
	/** Attributes */
	private int voto ;
    private Date Data_apello ;
	
	/** Associations */
	private Studente studente ;
	private Docente docente;
	private Corso corso ;
	
	
	

		public Esame (int voto, Date Data_apello ) {
			super(); 
			
			this.voto = voto;
            this.Data_apello = Data_apello ;

			
		}
		
		public int getVoto(){
			return voto ; 
		}
		public void setVoto ( int voto){
			this.voto= voto ;
		}
		
	public Date getData_apello(){
		return Data_apello;

	}	
		public void setData_apello(Date Data_apello){		
			
		this.Data_apello = Data_apello ;
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
	             this.docente = docente ;
}
 
              public Corso getCorso() {
	              return corso;
}
              public void setCroso(Corso corso) {
	             this.corso = corso ;
}

		
		public void Votomassimo(){
			if ( voto <= 30)
			System.out.println("il voto è ");
			
		}
			
		}			

/**
 * Operation
 *
 * @param ore
 * @return 
 */
