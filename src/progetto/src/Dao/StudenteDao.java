package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Base.BaseDao;
import EsamiOnLine.Esame;
import EsamiOnLine.Studente;

/**
 * @author Yassine Snoussi
 *
 */
@SuppressWarnings("unused")
public class StudenteDao extends BaseDao {
	 

	/**
	 * @return
	 */
	public List<Studente> getAllStudenti() {
		String selectReq = "SELECT * FROM studente";

		getConnection();
		List<Studente> studenteList = null;
		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ResultSet rs = ps.executeQuery();
			studenteList = new ArrayList<Studente>();
			while (rs.next()) {
				Studente studente = new Studente(rs.getInt("identifcativo"), rs.getString("nome"), rs.getDate("dataNascita"));

				studenteList.add(studente);

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studenteList;
	}

	/**
	 * @param identificativo
	 * @return
	 */
	public Studente getStudente(int identificativo) {
		String selectReq = "SELECT * FROM studente WHERE  `identificativo` = ?";

		getConnection();
		Studente studente = null;

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1, identificativo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				studente = new Studente(rs.getInt("identifcativo"), rs.getString("nome"), rs.getDate("dataNascita"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return studente;
	}

	/**
	 * @param c
	 */
	public void addStudente(Studente c) {
		String insertReq = "INSERT INTO `studente` (`identificativo`, `nome`, `dataNascita` ) VALUES ( ?, ?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, c.getIdentificativo());
			ps.setString(2, c.getNome());
			ps.setDate(3, new java.sql.Date(c.getDataNasicta().getTime()));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void updateStudente(Studente c) {
		String updateReq = "UPDATE `studente` SET    `nome`= ?,`dataNascita`= ? WHERE `code` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setString(1, c.getNome());
			ps.setDate(2, new java.sql.Date(c.getDataNasicta().getTime()));
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
	public void deleteStudente(Studente c) {
		String deleteReq = "DELETE FROM `studente`   WHERE `identficativo` =?  ";

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
	 * @param confermazione
	 */
	public void risultatiConfermati(Esame e, Studente s, int confermazione) {
		String updateReq = "UPDATE `esamepassato` SET    `risultatiConfermati`= ?  WHERE `esame` =? and `studente` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setInt(1, confermazione);
			ps.setInt(2, e.getIdentificativo());
			ps.setInt(3, s.getIdentificativo());

			ps.execute();
			ps.close();
		} catch (SQLException ee) {
			ee.printStackTrace();
		}

	}

}
