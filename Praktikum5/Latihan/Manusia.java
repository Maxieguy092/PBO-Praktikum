package org.manusia;

/*
	Nama 	: UNGGUL ADIMULIA
	NIM 	: 24060123140145
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
	protected String nama;
	protected LocalDate mulaiKerja;
	protected String alamat;
	protected double pendapatan;
	public static int counterMns = 0;
	
	public Manusia () {
		this.nama = "";
		this.mulaiKerja = LocalDate.of(1990,1,1);
		this.pendapatan = 0.0;
		counterMns += 1;
	}

	public Manusia (String nama, LocalDate mulaiKerja,String alaman, double pendapatan) {
		this.nama = nama;
		this.mulaiKerja = mulaiKerja; 
		this.alamat = alaman;
		this.pendapatan = pendapatan;
		counterMns += 1;
	}

	public String getNama() {
		return nama;
	}

	public LocalDate getMulaiKerja() {
		return mulaiKerja;
	}

	public String getAlamat() {
		return alamat;
	}

	public static int getCounterMns() {
		return counterMns;
	}

	public double getPendapatan() {
		return pendapatan;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public void setPendapatan(double pendapatan) {
		this.pendapatan = pendapatan;
	}
	
	public void setMulaiKerja(LocalDate mulaiKerja) {
		this.mulaiKerja = mulaiKerja;
	}

	public void cetakInfo() {
		System.out.println("Nama : " + nama);
		System.out.println("Alamat : " + alamat);
		System.out.println("Pendapatan : " + pendapatan);
		
		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd MMM yyyy");
		System.out.println("Mulai Kerja : " + mulaiKerja.format(DTF));
	}

	public abstract int hitungMasaKerja();

}
