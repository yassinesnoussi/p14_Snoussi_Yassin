package EsamiOnLine;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@XmlRootElement(name = "corso")
public class Corso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3510201685565421819L;
	private Integer Identificativo;
	private String Nome;

	public Corso() {
	}

	public Corso(Integer i, String n) {
		Identificativo = i;
		Nome = n;
	}

	@XmlElement
	public Integer getIdentificativo() {
		return Identificativo;
	}

	public void setIdentificativo(Integer Identificativo) {
		this.Identificativo = Identificativo;
	}
	
	public String getnome() {
		return Nome;
	}
	public void setnome (String nome){
	this.Nome = nome ;
}
}