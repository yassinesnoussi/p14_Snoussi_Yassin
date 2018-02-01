package Model;

import Model.Corso;
import Model.Studente;


	/**
	 * @author Yassine Snoussi
	 * @version 1.8
	  */
    /**
	 * Classe: Esame
	 * contiene il voto  di uno studente 
	 *
	 */
	public class Esame {
		
		/** Attributes */
		private int voto;
		
		/** Associations */
 
		private Studente studente;
		private Corso corso;

		
		
		
		 
		

		public Esame(int voto, Studente studente,  Corso corso) {
			super();
			this.voto = voto;
			this.studente = studente;
			this.corso = corso;
		}




		/**
		 * @return
		 */
		public int getVoto() {
			return voto;
		}


		/**
		 * @param voto
		 */
		public void setVoto(int voto) {
			this.voto = voto;
		}

 
			/**
			 * @param studente
			 */
			public void setStudente(Studente studente) {
				this.studente=studente;
			}
			
 

			/**
			 * @return
			 */
			public Studente getStudente() {
				return studente;
			}
			


		/**
		 * @return
		 */
		public Corso getCorso() {
			return corso;
		}


		/**
		 * @param corso
		 */
		public void setCorso(Corso corso) {
			this.corso = corso;
		}

 
	
	
		/** 
		 * @param voto
		 * @return
		 *  
		 */
		public boolean isStatoVoto(int voto) {
			if (voto>=18 &&  studente.isVotoConfermato()==true) {
				return true;
			}else {return false;
			}}
		}

		

