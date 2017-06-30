package EsamiOnLine;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Yassine Snoussi
 *
 */
@XmlRootElement(name = "studente")
public class Studente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3609380215804629655L;

	private int Identificativo;

	private String nome;
	private Date dataNascita;

	public Studente() {
	}

	public Studente(int i, String n, Date d) {
		Identificativo = i;
		nome = n;
		dataNascita = d;
	}

	@XmlElement
	public int getIdentificativo() {
		return Identificativo;
		
	}
	
	public void setIdentficativo(int identificativo) {
		this.Identificativo = identificativo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	public Date getDataNasicta() {
		return dataNascita;
	}

	public void setDataNasita(Date dataNascita) {
		this.dataNascita = dataNascita;
}

	}
