package org.kendaraan;

/*
 * Nama File : Kendaraan.java
 * Deskripsi : Atribut dan Method dalam class Kendaraan
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 27-02-2025
 * */

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
