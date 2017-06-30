package EsamiOnLine;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@XmlRootElement(name = "esamePassato")
public class EsamePassato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6677521447347131308L;
    
	private Date data;

	private Double voto;

	private Boolean risultatiConfermati;

	private Integer studente;
	private Integer esame;

	public EsamePassato() {
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getVoto() {
		return voto;
	}

	public void setVoto(Double voto) {
		this.voto = voto;
	}

	public Boolean getRisultatiConfermati() {
		return risultatiConfermati;
	}

	public void setRisultatiConfermati(Boolean risultatiConfermati) {
		this.risultatiConfermati = risultatiConfermati;
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