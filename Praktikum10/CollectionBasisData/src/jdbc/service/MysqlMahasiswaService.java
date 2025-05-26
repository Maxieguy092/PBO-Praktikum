package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MySQLUtilities;

public class MysqlMahasiswaService {
	Connection connection;

	public MysqlMahasiswaService() {
		this.connection = MySQLUtilities.getConnection();
	}

	public Mahasiswa makeMahasiswaObject(ResultSet rs) throws SQLException{
		Mahasiswa mhs = new Mahasiswa();
		mhs.setId(rs.getInt("ID"));
		mhs.setNama(rs.getString("nama"));

		return mhs;
	}

	public void add(Mahasiswa mhs) {
		try {
			
			String query = "INSERT INTO MAHASISWA (ID, nama) VALUES (" + mhs.getId() + ",'" + mhs.getNama() + "')";
			System.out.println(query);
			Statement s = connection.createStatement();
			s.executeUpdate(query);
		} catch (SQLException e) {
			System.err.println("SQL EXCEPTION");
			e.printStackTrace();
		}
	}
   	
	public void update(Mahasiswa mhs) {
        	try {
            		String sql = "UPDATE mahasiswa SET nim=" + mhs.getId() + ", nama=" + mhs.getNama() +  ", WHERE id="+ mhs.getId();
            		PreparedStatement ps = connection.prepareStatement(sql);
        	} catch (SQLException e) {
            		System.out.println("Error update data: " + e.getMessage());
        	}
    	}
    
	public void delete(int id) {
		try {
			String sql = "DELETE FROM mahasiswa WHERE id=" + id;
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error delete data: " + e.getMessage());
		}
    	}

    // Ambil mahasiswa berdasarkan ID
    	public Mahasiswa getById(int id) {
        	Mahasiswa mhs = null;
        	try {
            		String sql = "SELECT * FROM mahasiswa WHERE id=?" ;
            		PreparedStatement ps = connection.prepareStatement(sql);
            		ps.setInt(1, id);
            		ResultSet rs = ps.executeQuery();
            	if (rs.next()) {
                	mhs = makeMahasiswaObject(rs);
            	}
        	} catch (SQLException e) {
         	   	System.out.println("Error getById: " + e.getMessage());
        	}
        	return mhs;
    	}

    // Ambil semua mahasiswa
    	public List<Mahasiswa> getAll() {
        	List<Mahasiswa> list = new ArrayList<>();
        	try {
            		String sql = "SELECT * FROM mahasiswa";
            		Statement stmt = connection.createStatement();
            		ResultSet rs = stmt.executeQuery(sql);
            		while (rs.next()) {
                		Mahasiswa mhs = makeMahasiswaObject(rs);
                		list.add(mhs);
            		}
        	} catch (SQLException e) {
            		System.out.println("Error getAll: " + e.getMessage());
        	}
        	return list;
    	}

	
}
