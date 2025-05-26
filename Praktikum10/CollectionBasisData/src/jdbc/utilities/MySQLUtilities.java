package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UnggulAdi
 */
public class MySQLUtilities {
	private static Connection connection;

	public static Connection getConnection(){
		if (connection == null) {
			try {
			        Class.forName("com.mysql.cj.jdbc.Driver");
	
	        	        String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
	        	        String user = "student";
	        	        String password = "rahasia";
	
                		connection = DriverManager.getConnection(url, user, password);
		                if (connection != null) {
                    			System.out.println("Koneksi berhasil!");
                		}

  		        } catch (ClassNotFoundException cne) {
               			System.out.println("Gagal load driver : " + cne.getMessage());
          		} catch (SQLException sqle) {
                		System.out.println("Gagal Koneksi : " + sqle.getMessage());
            		}

		}
		
		return connection;
	}

}
