package EsamiOnLine;
import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author yassine Snoussi
 *
 */
@XmlRootElement(name = "esame")
public class Esame implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8392318177718205636L;

	private Integer Identificativo;

	private String nome;

	private Date data_apello_esame;

	private String ora;

	private Double durata;

	public Esame() {
	}

	public Esame(Integer i, String n, Date d, String o, Double du) {
		Identificativo = i;
		nome = n;
		data_apello_esame = d;
		ora = o;
		durata = du;

	}

	@XmlElement
	public Integer getIdentificativo() {
		return Identificativo;
	}

	public void setIdentificativo(Integer identificativo) {
		this.Identificativo = identificativo;
	}

	@XmlElement
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@XmlElement
	public Date getData() {
		return data_apello_esame;
	}

	public void setData(Date data) {
		this.data_apello_esame = data;
	}

	@XmlElement
	public String getOra() {
		return ora;
	}

	public void setOra(String ora) {
		this.ora = ora;
	}

	@XmlElement
	public Double getDurata() {
		return durata;
	}

	public void setDurata(Double durata) {
		this.durata = durata;
	}

}