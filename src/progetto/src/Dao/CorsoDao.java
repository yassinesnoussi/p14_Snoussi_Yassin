package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Base.BaseDao;
import EsamiOnLine.Corso;

/**
 * @author Yassine Snoussi
 *
 */
public class CorsoDao extends BaseDao {
	 

	/**
	 * @return
	 */
	public List<Corso> getAllCorsos() {
		String selectReq = "SELECT * FROM corso";

		getConnection();
		List<Corso> corsoList = null;
		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ResultSet rs = ps.executeQuery();
			corsoList = new ArrayList<Corso>();
			while (rs.next()) {
				Corso corso = new Corso(rs.getInt("code"), rs.getString("nome"));

				corsoList.add(corso);

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return corsoList;
	}

	/**
	 * @param code
	 * @return
	 */
	public Corso getCorso(Integer code) {
		String selectReq = "SELECT * FROM corso WHERE  `code` = ?";

		getConnection();
		Corso corso = null;

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1, code);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				corso = new Corso(rs.getInt("code"), rs.getString("nome"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return corso;
	}

	/**
	 * @param c
	 */
	public void addCorso(Corso c) {
		String insertReq = "INSERT INTO `corso` (`identfifcativo`, `nome`) VALUES ( ?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, c.getIdentificativo());
			ps.setString(2, c.getnome());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void updateCorso(Corso c) {
		String updateReq = "UPDATE `corso` SET    `nome`= ? WHERE `code` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setString(1, c.getnome());
			ps.setInt(2, c.getIdentificativo());

			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void deleteCorso(Corso c) {
		String deleteReq = "DELETE FROM `corso`   WHERE `code` = ?  ";

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

}
