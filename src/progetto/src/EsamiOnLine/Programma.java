package EsamiOnLine;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author hamza zaghdoudi
 *
 */
@XmlRootElement(name = "programma")
public class Programma implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6060573406909883788L;

	private Integer identificativo;

	private String nome;

	private Integer anno;

	public Programma() {
	}

	public Programma(Integer i, String n, int a) {
		identificativo = i;
		nome = n;
		anno = a;
	}

	@XmlElement
	public Integer getIdentificativo() {
		return identificativo;
	}

	public void setId(Integer identificativo) {
		this.identificativo = identificativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

public Integer getAnno() {
	return anno;
}

public void setAnno(Integer anno) {
	this.anno = anno;
}
}
