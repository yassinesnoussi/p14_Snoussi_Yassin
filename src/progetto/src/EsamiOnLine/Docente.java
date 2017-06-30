package EsamiOnLine;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@SuppressWarnings("unused")
@XmlRootElement(name = "docente")
public class Docente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3968139721205096403L;

	private Integer Identificativo;

	private String nome;

	private Date dataReclutamento;

	public Docente() {
	}

	public Docente(Integer i, String n, Date d) {
		Identificativo = i;
		nome = n;
		dataReclutamento = d;
	}

	public int getIdentificativo() {
		return Identificativo;
	}

	public void setIdentificativo(int Identificativo) {
		this.Identificativo = Identificativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

public Date getdataReclutamento() {
	return dataReclutamento;
}

public void setdataReclutamento(Date dataReclutamento) {
	this.dataReclutamento = dataReclutamento;
}


}


	
