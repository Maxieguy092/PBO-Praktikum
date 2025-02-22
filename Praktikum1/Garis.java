package org.garis;

/*
 * Nama File : Garis.java
 * Deskripsi : Atribut dan Method dalam class Garis
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 20-02-2025
 * */

import org.titik.Titik;

public class Garis {
	// Atribut
	public Titik awal;
	public Titik akhir;
	public static int counterGaris = 0;

	// konstruktor
	public Garis() {
		Titik T1 = new Titik();
		Titik T2 = new Titik(1, 1);
		this.awal = T1;
		this.akhir = T2;
		counterGaris++;
	}

	public Garis(Titik awal, Titik akhir) {
		this.awal = awal;
		this.akhir = akhir;
		counterGaris++;
	}

	// setter getter
	public Titik getAwal() {
		return awal;
	}

	public Titik getAkhir() {
		return akhir;
	}

	public int getGarisCounter() {
		return Garis.counterGaris;
	}

	public void setAwal(Titik awal) {
		this.awal = awal;
	}

	public void setAkhir(Titik akhir) {
		this.akhir = akhir;
	}

	// method lain
	public double panjang() {
		return awal.getJarak(akhir);
	}

	public double gradient() {
		return (akhir.getOrdinat() - awal.getOrdinat()) / (akhir.getAbsis() - awal.getAbsis());
	}

	public Titik titikTengah() {
		Titik mid = new Titik();

		mid.setAbsis((akhir.getAbsis() - awal.getAbsis()) / 2);
		mid.setOrdinat((akhir.getOrdinat() - awal.getOrdinat()) / 2);

		return mid;
	}

	public boolean isParallel(Garis G2) {
		return this.gradient() == G2.gradient();
	}

	public boolean isOrthogonal(Garis G2) {
		return this.gradient() * G2.gradient() == -1;
	}

	public void printGaris() {
		System.out.println("Awal : {" + awal.getAbsis() + "," + awal.getOrdinat() + "}");
		System.out.println("Akhir : {" + akhir.getAbsis() + "," + akhir.getOrdinat() + "}");
	}

	public void printSlopeIntercept() {
		double slope = gradient();
		double intercept = awal.getOrdinat() - awal.getAbsis() * slope;

		System.out.println("y = " + slope + "x + " + intercept);
	}
}
