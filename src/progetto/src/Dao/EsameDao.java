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
import EsamiOnLine.Studente;

/**
 * @author Yassine Snoussi
 *
 */
@SuppressWarnings("unused")
public class EsameDao extends BaseDao {
	 

	/**
	 * @return
	 */
	public List<Esame> getAllEsami() {
		String selectReq = "SELECT * FROM esame";

		getConnection();
		List<Esame> esameList = null;
		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ResultSet rs = ps.executeQuery();
			esameList = new ArrayList<Esame>();
			while (rs.next()) {
				Esame esame = new Esame(rs.getInt("code"), rs.getString("nome"), rs.getDate("data"),
						rs.getString("ora"), rs.getDouble("durata"));

				esameList.add(esame);

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return esameList;
	}

	/**
	 * @param code
	 * @return
	 */
	public Esame getEsame(Integer code) {
		String selectReq = "SELECT * FROM esame WHERE  `code` = ?";

		getConnection();
		Esame esame = null;

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				esame = new Esame(rs.getInt("code"), rs.getString("nome"), rs.getDate("data"), rs.getString("ora"),
						rs.getDouble("durata"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return esame;
	}

	/**
	 * @param c
	 */
	public void addEsame(Esame c) {
		String insertReq = "INSERT INTO `esame` (`Identfifcativo`, `nome`, `data`, `ora`, `durata` ) VALUES ( ?, ?, ?, ?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, c.getIdentificativo());
			ps.setString(2, c.getNome());
			ps.setDate(3, new java.sql.Date(c.getData().getTime()));
			ps.setString(4, c.getOra());
			ps.setDouble(5, c.getDurata());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void updateEsame(Esame c) {
		String updateReq = "UPDATE `esame` SET    `nome`= ?,`data`= ?,`ora`= ?,`durata`= ?  WHERE `code` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setString(1, c.getNome());
			ps.setDate(2, new java.sql.Date(c.getData().getTime()));
			ps.setString(3, c.getOra());
			ps.setDouble(4, c.getDurata());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void deleteEsame(Esame c) {
		String deleteReq = "DELETE FROM `esame`   WHERE `code` =?  ";

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
	 * @param d
	 */
	public void addIscrizione(Esame e, Studente s, Date d) {
		String insertReq = "INSERT INTO `esameiscrizione` (`esame`, `studente`, `data` ) VALUES ( ?,  ?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, e.getIdentificativo());
			ps.setInt(2, s.getIdentificativo());
			ps.setDate(3, new java.sql.Date(d.getTime()));

			ps.execute();
			ps.close();
		} catch (SQLException ee) {
			ee.printStackTrace();
		}

	}

	/**
	 * @param esame
	 * @param studente
	 * @return
	 */
	public boolean isRegistrato(Integer esame, Integer studente) {
		String selectReq = "SELECT * FROM esameiscrizione WHERE  `esame` = ? and `studente` = ? ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1, esame);
			ps.setInt(2, studente);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				return true;
			}
			return false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * @param e
	 * @param s
	 * @param d
	 */
	public void addPartecipante(Esame e, Studente s, Date d) {
		if (isRegistrato(e.getIdentificativo(), s.getIdentificativo())) {
			String insertReq = "INSERT INTO `esamepassato` (`esame`, `studente`, `data` ) VALUES ( ?,  ?, ?)";

			getConnection();

			try {
				PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
				ps.setInt(1, e.getIdentificativo());
				ps.setInt(2, s.getIdentificativo());
				ps.setDate(3, new java.sql.Date(d.getTime()));

				ps.execute();
				ps.close();
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
		}
	}

}