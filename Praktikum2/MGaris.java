package org.mgaris;

import org.garis.Garis;
import org.titik.Titik;

public class MGaris {
	public static void main(String[] args) {
		Titik awal = new Titik(-2, 0);
		Titik akhir = new Titik(0, 4);

		Garis garis = new Garis(awal, akhir);
		Garis G1 = new Garis();

		garis.printGaris();
		G1.printGaris();

		Titik T1 = new Titik(1,1);
		// System.out.println(T1.absis); // Error
		System.out.println(T1.getAbsis()); // Tidak Error

		Garis G2 = new Garis();
		// System.out.println(G2.awal); // Error
		System.out.println(G2.getAwal()); //Tidak Error 

		System.out.println(garis.panjang());
		System.out.println(garis.gradient());

		garis.titikTengah().printTitik();
		System.out.println(garis.isParallel(G1));

		System.out.println(garis.isParallel(G1));

		System.out.println(garis.getGarisCounter());
		
		//Slope Intercept

		garis.printSlopeIntercept();
	}
}
