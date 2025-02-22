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
