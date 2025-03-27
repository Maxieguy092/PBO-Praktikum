package org.ruang;

public abstract class Ruang {
	protected int kode;
	protected double panjang;
	protected double lebar;
	protected double tinggi;
	protected int capacity;
	protected static int ruangCounter;

	public Ruang() {
		ruangCounter += 1;
		this.kode = ruangCounter;
		this.panjang = 0;
		this.lebar = 0;
		this.tinggi = 0;
		this.capacity = 0;
	}
	
	public Ruang(double panjang, double lebar, double tinggi, int capacity) {
		ruangCounter += 1;
		this.kode = ruangCounter;
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.capacity = capacity;
	}

	public int getKode() {
		return kode;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public double getLebar() {
		return lebar;
	}

	public double getTinggi() {
		return tinggi;
	}

	public double getPanjang() {
		return panjang;
	}

	public static int getRuangCounter() {
		return ruangCounter;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public void printInfo() {
		System.out.println("Kode Ruang			: " + kode);
		System.out.println("panjang				: " + panjang);
		System.out.println("Lebar				: " + lebar);
		System.out.println("Tinggi				: " + tinggi);
		System.out.println("Capacity			: " + capacity);
	}

	public abstract double hitungTarif();
}
