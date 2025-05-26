package jdbc.model;

/**
 *
 * @author UnggulAdi
 */
public class Mahasiswa {
	private int id;
	private String nama;

	public Mahasiswa() {
		this.id = 0;
		this.nama = "";
	}

	public Mahasiswa(int id, String nama) {
		this.id = id;
		this.nama = nama;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getId() {
		return id;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}


	public String getNama() {
		return nama;
	}

	@Override
	public String toString() {
		return "Mahasiswa(" + "ID : " + id + "NAMA : " + nama + ")";
	}
	
	
}
