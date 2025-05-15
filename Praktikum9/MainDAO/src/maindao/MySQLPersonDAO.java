package maindao;

import java.sql.*;

/**
 *
 * @author UnggulAdi
 */
public class MySQLPersonDAO implements PersonDAO {
    @Override
    public void savePerson(Person P) throws Exception {
        String name = P.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection com = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");

        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = com.createStatement();
        s.executeUpdate(query);
        com.close();
    }
}
