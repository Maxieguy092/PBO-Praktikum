package org.bangundatar;

/*
 * File					: BangunDatar.java
 * Deskripsi		: Praktikum Inheritence
 * Nama					: Unggul Adimulia
 * NIM					: 24060123140145
 * */

public class BangunDatar {
	private int jmlSisi;
	private String warna;
	protected String border;
	private static int bangunDatarCounter;
	
	// Modifier protected tidak mengubah jalan program karena semua class dalam program ini dalam satu package
	// jika misal class persegi di package yg beda e.g package org.regularpolyhedron maka program akan error

	public BangunDatar (){
		
	}

	public BangunDatar (int jmlSisi, String warna, String border) {
		this.jmlSisi = jmlSisi;
		this.warna = warna;
		this.border = border;
	}

	public int getJmlSisi() {
		return jmlSisi;
	}

	public void setJmlSisi(int jmlSisi) {
		this.jmlSisi = jmlSisi; 
	}

	public String getWarna() {
		return warna;
	}

	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public void printInfo() {
			System.out.println("Jumlah Sisi " + jmlSisi);
			System.out.println("Border " + border);
			System.out.println("Warna " + warna);
	}

	public static void printCounterBangunDatar() {
		System.out.println("Jumlah Objek Bangun Datar : " + bangunDatarCounter);
	}
}

// Keyword final menyatakan bahwa class tidak bisa di extend atau diwaris lagi jadi jika keyword extend ditambah 
// pada kelas ini maka class persegi akan error
//
// jika kita remove keyword final dari class ini maka class persegi akan berjalan seperti normal
