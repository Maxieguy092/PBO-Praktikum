package org.titik;

/*
 * Nama File : Titik.java
 * Deskripsi : Atribut dan Method dalam class Titik
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 20-02-2025
 * */

public class Titik {
	// Atribut
	private double absis;
	private double ordinat;
	private static int counterTitik = 0;

	// Konstruktor
	public Titik() {
		this.absis = 0;
		this.ordinat = 0;
		counterTitik++;
	}

	// Konstruktor overloading
	public Titik(double absis, double ordinat) {
		this.absis = absis;
		this.ordinat = ordinat;
		counterTitik++;
	}

	// Method

	// Setter Getter
	public double getAbsis() {
		return absis;
	}

	public double getOrdinat() {
		return ordinat;
	}

	public int getCounter() {
		return counterTitik;
	}

	public void setAbsis(double absis) {
		this.absis = absis;
	}

	public void setOrdinat(double ordinat) {
		this.ordinat = ordinat;
	}

	// Method Lain
	public void geser(double dx, double dy) {
		this.absis += dx;
		this.ordinat += dy;
	}

	public void printTitik() {
		System.out.println("Titik : { " + absis + "," + ordinat + "}");
	}

	public int getKuadran() {
		if (absis >= 0 && ordinat >= 0) {
			return 1;
		} else if (absis >= 0 && ordinat <= 0) {
			return 2;
		} else if (absis <= 0 && ordinat <= 0) {
			return 3;
		} else {
			return 4;
		}
	}

	public double getJarakPusat() {
		return Math.sqrt((absis * absis) + (ordinat * ordinat));
	}

	public double getJarak(Titik T) {
		return Math.sqrt(
				(T.absis - this.absis) * (T.absis - this.absis) + (T.ordinat - this.ordinat) * (T.ordinat - this.ordinat));
	}

	public void refleksiX() {
		absis = absis * -1;
	}

	public void refleksiY() {
		ordinat = ordinat * -1;
	}

	public Titik getRefleksiX() {
		Titik T = new Titik(absis * -1, ordinat);

		return T;
	}

	public Titik getRefleksiY() {
		Titik T = new Titik(absis, ordinat * -1);

		return T;
	}
} // End Class Titik
