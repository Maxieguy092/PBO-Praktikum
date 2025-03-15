package org.bangundatar;

/*
 * File					: Persegi.java
 * Deskripsi		: Praktikum Inheritence
 * Nama					: Unggul Adimulia
 * NIM					: 24060123140145
 * */

public class Persegi extends BangunDatar {
	private double sisi;

	public Persegi () {
		setJmlSisi(4);
	}

	public Persegi(double sisi, String warna, String border) {
		super(4,warna,border);
		this.sisi = sisi;
		//setWarna(warna);
		//setBorder(border);
		//setJmlSisi(4);
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	// Overriding berarti mendefinisi method baru dengan signature yang sama pada subclass
	// jika method ini dipanggil oleh objec persegi maka method yg di override akan dipanggil
	//
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Sisi : " + sisi);
	}

	/*
	@Override
	public static void printCounterBangunDatar() {
		System.out.println("This Shouldn't Work");
	} */
}
