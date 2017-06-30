package EsamiOnLine;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@SuppressWarnings("unused")
@XmlRootElement(name = "corsoFacoltativo")
public class CorsoFacoltativo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -378685487412537906L;
	private Integer corsoProgramma;
	private Integer studente;

	public CorsoFacoltativo() {
	}

	@XmlElement
	public Integer getCorsoProgramma() {
		return corsoProgramma;
	}

	public void setCorsoProgramma(Integer corsoProgramma) {
		this.corsoProgramma = corsoProgramma;
	}

	@XmlElement
	public Integer getStudente() {
		return studente;
	}

	public void setStudente(Integer studente) {
		this.studente = studente;
	}
}