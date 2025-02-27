package org.kendaraan;

public class Kendaraan {
	private String noPlat;
	private String jenis;

	public Kendaraan() {
		this.noPlat = "B1111F";
		this.jenis = "Mobil";
	}

	public Kendaraan(String noPlat, String jenis) {
		this.noPlat = noPlat; 
		this.jenis = jenis;
	}

	public String getNoPlat() {
		return noPlat;
	}
	
	public String getJenis() {
		return jenis;
	}

	public void setNoPlat(String noPlat) {
		this.noPlat = noPlat;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
}
