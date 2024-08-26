package dev.mouse.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dev.mouse.model.Mouse;
import dev.mouse.db.DBUtil;

// Mouse DAO 클래스
public class mouseDAO {
	
	public List<Mouse> findAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset;
		Mouse mouse;
		List<Mouse> mouseList = new ArrayList<>();

		String query = "SELECT * FROM mouse";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				int id = rset.getInt("id");
				String name = rset.getString("name");
				String country = rset.getString("country");
				String address = rset.getString("address");
				mouse = new Mouse(id, name, country, address);

				mouseList.add(mouse);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con, pstmt);
		}

		return mouseList;
	}
	
}
