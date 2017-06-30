package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Base.BaseDao;
import EsamiOnLine.Esame;
import EsamiOnLine.Docente;
import EsamiOnLine.Studente;

@SuppressWarnings("unused")
public class DocenteDao extends BaseDao {
	 

	/**
	 * @return
	 */
	public List<Docente> getAllDocenti() {
		String selectReq = "SELECT * FROM docente";

		getConnection();
		List<Docente> docenteList = null;
		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ResultSet rs = ps.executeQuery();
			docenteList = new ArrayList<Docente>();
			while (rs.next()) {
				Docente docente = new Docente(rs.getInt("identificativo"), rs.getString("nome"),
						rs.getDate("dataReclutamento"));

				docenteList.add(docente);

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return docenteList;
	}

	/**
	 * @param identificativo
	 * @return
	 */
	public Docente getDocente(Integer Identificativo) {
		String selectReq = "SELECT * FROM docente WHERE  `identificativo` = ?";

		getConnection();
		Docente docente = null;

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1,Identificativo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				docente = new Docente(rs.getInt("identificativo"), rs.getString("nome"), rs.getDate("dataReclutamento"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return docente;
	}

	/**
	 * @param c
	 */
	public void addInsegnante(Docente c) {
		String insertReq = "INSERT INTO `docente` (`identificativo`, `nome`, `dataReclutamento` ) VALUES ( ?, ?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, c.getIdentificativo());
			ps.setString(2, c.getNome());
			ps.setDate(3, new java.sql.Date(c.getdataReclutamento().getTime()));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void updateDocente(Docente c) {
		String updateReq = "UPDATE `docente` SET    `nome`= ?,`dataNascita`= ? WHERE `identificativo` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setString(1, c.getNome());
			ps.setDate(2, new java.sql.Date(c.getdataReclutamento().getTime()));
			ps.setInt(3, c.getIdentificativo());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void deleteDocente(Docente c) {
		String deleteReq = "DELETE FROM `docente`   WHERE `code` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(deleteReq);
			ps.setInt(1, c.getIdentificativo());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param e
	 * @param s
	 * @param voto
	 */
	public void setVoto(Esame e, Studente s, Double voto) {
		String updateReq = "UPDATE `esamepassato` SET    `voto`= ?  WHERE `esame` =? and `studente` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setDouble(1, voto);
			ps.setInt(2, e.getIdentificativo());
			ps.setInt(3, s.getIdentificativo());

			ps.execute();
			ps.close();
		} catch (SQLException ee) {
			ee.printStackTrace();
		}

	}

}
