package EsamiOnLine;


	
	
	import java.io.Serializable;
	import java.util.Date;

	import javax.xml.bind.annotation.XmlRootElement;

	/**
	 * @author Yassine Snoussi
	 *
	 */
	@XmlRootElement(name = "esameIscrizione")
	public class EsamePrenotazione implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 5847195591922389658L;
		private Date data;
		private Integer studente;
		private Integer esame;

		public EsamePrenotazione() {
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public Integer getStudente() {
			return studente;
		}

		public void setStudente(Integer studente) {
			this.studente = studente;
		}

		public Integer getEsame() {
			return esame;
		}

		public void setEsame(Integer esame) {
			this.esame = esame;
		}


}
