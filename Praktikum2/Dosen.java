package org.dosen;

public class Dosen {
	private String NIP;
	private String nama;
	private String prodi;

	public Dosen() {
		this.NIP = "NIL";
		this.nama = "NIL";
		this.prodi = "NIL";
	}

	public Dosen(String NIP, String nama, String prodi) {
		this.NIP = NIP;
		this.nama = nama;
		this.prodi = prodi;
	}

	public String getNIP() {
		return NIP;
	}

	public String getNama() {
		return nama;
	}

	public String getProdi() {
		return prodi;
	}

	public void setNIP(String NIP) {
		this.NIP = NIP;
	}

	public void setNama(String nama) {
		this.NIP = nama;
	}

	public void setProdi(String prodi) {
		this.NIP = prodi;
	}
}
