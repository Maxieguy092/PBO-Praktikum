package org.MTitik;

/*
 * Nama File : MTitik.java
 * Deskripsi : Main Program untuk class Titik
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 20-02-2025
 * */

import org.titik.Titik;

public class MTitik {
	public static void main(String[] args) {
		Titik T1 = new Titik();

		T1.setAbsis(15.0);
		T1.setOrdinat(12.0);

		T1.printTitik();

		System.out.println("Setelah geser");
		T1.geser(5.0, 8.0);
		T1.printTitik();

		// Object Reference
		System.out.println("object reference");
		Titik T2 = T1;
		T2.printTitik();
		T1.setAbsis(5.0);
		T1.setOrdinat(5.0);
		T2.printTitik();

		T1 = new Titik();
		T2 = new Titik(1.0, 1.0);

		T1.geser(5.0, 1.0);

		System.out.println("Jarak titik dr pusat " + T2.getJarakPusat());
		System.out.println("Jarak titik dr T1 " + T2.getJarak(T1));

		System.out.println("Refleksi");
		T1.refleksiX();
		T1.printTitik();

		T2.refleksiY();
		T2.printTitik();

		T1 = new Titik();
		T2 = new Titik(1.0, 1.0);

		T1.geser(5.0, 1.0);

		Titik refT1 = T1.getRefleksiX();
		Titik refT2 = T2.getRefleksiY();

		refT1.printTitik();
		refT2.printTitik();
	}
}
