package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Base.BaseDao;
import EsamiOnLine.Programma;

@SuppressWarnings("unused")
public class ProgrammaDao extends BaseDao {
 

	/**
	 * @return
	 */
	public List<Programma> getAllProgrammi() {
		String selectReq = "SELECT * FROM programma";

		getConnection();
		List<Programma> programmaList = null;
		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ResultSet rs = ps.executeQuery();
			programmaList = new ArrayList<Programma>();
			while (rs.next()) {
				Programma programma = new Programma(rs.getInt("identifcativo"), rs.getString("nome"), rs.getInt("anno"));

				programmaList.add(programma);

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return programmaList;
	}

	/**
	 * @param code
	 * @return
	 */
	public Programma getProgramma(Integer identifcativo) {
		String selectReq = "SELECT * FROM programma WHERE  `Identificativo` = ?";

		getConnection();
		Programma programma = null;

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(selectReq);
			ps.setInt(1, identifcativo);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				programma = new Programma(rs.getInt("identificativo"), rs.getString("nome"), rs.getInt("anno"));
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return programma;
	}

	/**
	 * @param c
	 */
	public void addProgramma(Programma c) {
		String insertReq = "INSERT INTO `programma` (`identfifcativo`, `nome`, `anno`) VALUES ( ?,?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, c.getIdentificativo());
			ps.setString(2, c.getNome());
			ps.setInt(3, c.getAnno());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param c
	 */
	public void updateProgramma(Programma c) {
		String updateReq = "UPDATE `programma` SET    `nome`= ?, `anno`=? WHERE `identifcativo` =?  ";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(updateReq);
			ps.setString(1, c.getNome());
			ps.setInt(2, c.getAnno());
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
	public void deleteProgramma(Programma c) {
		String deleteReq = "DELETE FROM `programma`   WHERE `id` =?  ";

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

	/** Add corso to programma
	 * @param corso
	 * @param programma
	 * @param docente
	 * @param credito
	 * @param obbligatorio
	 */
	public void addCorso(Integer corso, Integer programma, Integer docente, Double credito, Integer obbligatorio) {
		String insertReq = "INSERT INTO `corsoprogramma` (`corso`, `programma`, `docente`, `credito`, `obbligatorio`) VALUES ( ?,?,?,?, ?)";

		getConnection();

		try {
			PreparedStatement ps = mysqlConnection.prepareStatement(insertReq);
			ps.setInt(1, corso);
			ps.setInt(2, programma);
			ps.setInt(3, docente);
			ps.setDouble(4, credito);
			ps.setInt(5, obbligatorio);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}