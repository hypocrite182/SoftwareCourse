import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iom.db.db_getConnect;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db_getConnect.username="zsc";
		db_getConnect.password="123456";
		try {
			Connection con = db_getConnect.getConnection();
			PreparedStatement pstm = con.prepareStatement("select * from CarRegisterInfo");
			pstm.execute();
			ResultSet rs = pstm.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
