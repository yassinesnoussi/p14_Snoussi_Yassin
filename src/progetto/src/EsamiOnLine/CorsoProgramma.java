package EsamiOnLine;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@XmlRootElement(name = "corsoProgramma")
public class CorsoProgramma implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3809208375798694779L;
	private Integer identificativo;
	private Boolean obbligatorio;
	private Double credito;
	private Integer corso;
	private Integer programma;
	private Integer docente;

	public CorsoProgramma() {
	}

	@XmlElement
	public Integer getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(Integer identificativo) {
		this.identificativo = identificativo;
	}

	@XmlElement
	public Boolean getObbligatorio() {
		return obbligatorio;
	}

	public void setObbligatorio(Boolean obbligatorio) {
		this.obbligatorio = obbligatorio;
	}

	@XmlElement
	public Double getCredito() {
		return credito;
	}

	public void setCredito(Double credito) {
		this.credito = credito;
	}

	public Integer getCorso() {
		return corso;
	}

	public void setCorso(Integer corso) {
		this.corso = corso;
	}

	
	public Integer getProgramma() {
		return programma;
	}

	public void setProgramma(Integer programma) {
		this.programma = programma;
	}

	
	public Integer getDocente() {
		return docente;
	}

	public void setInsegnante(Integer docente) {
		this.docente = docente;
	}
}
