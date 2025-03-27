package org.ruang;

public class Lab extends Ruang {
	private String namaLab;
	private String matkul;
	private double tarifLab;

	public Lab() {
		this.namaLab = "Tempname";
		this.matkul = "tempname";
		this.tarifLab = 0;
	}

	public Lab(double panjang, double lebar, double tinggi, int capacity, String namaLab, String matkul, double tarifLab) {
		super(panjang, lebar, tinggi, capacity);
		this.namaLab = namaLab;
		this.matkul = matkul;
		this.tarifLab = tarifLab;
	}

	public String getNamaLab() {
		return namaLab;
	}

	public String getMatkul() {
		return matkul;
	}

	public double getTarifLab() {
		return tarifLab;
	}

	public void setNamaLab(String namaLab) {
		this.namaLab = namaLab;
	}

	public void setMatkul(String matkul) {
		this.matkul = matkul;
	}

	public void setTarifLab(double tarifLab) {
		this.tarifLab = tarifLab;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Nama Lab			: "+ namaLab);
		System.out.println("Matkul Lab			: " + matkul);
		System.out.println("Tarif Kebersihan		: " + hitungTarif());
	}

	@Override
	public double hitungTarif() {
		return getPanjang() * getLebar() * tarifLab;
	}
}
