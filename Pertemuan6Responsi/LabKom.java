package org.ruang;

public class LabKom extends Ruang {
	private String namaLab;
	private int jumlahKom;
	private double tarifLab;

	public LabKom() {
		this.namaLab = "Tempname";
		this.jumlahKom = 0;
		this.tarifLab = 0;
	}

	public LabKom(double panjang, double lebar, double tinggi, int capacity,String namaLab, int jumlahKom, double tarifLab) {
		super(panjang, lebar, tinggi, capacity);
		this.namaLab = namaLab;
		this.jumlahKom = jumlahKom;
		this.tarifLab = tarifLab;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Nama Lab			: " + namaLab);
		System.out.println("Jumlah Komputer			: " + jumlahKom);
		System.out.println("Tarif Kebersihan		: " + hitungTarif());
	}

	@Override
	public double hitungTarif() {
		return getPanjang() * getLebar() * tarifLab;
	}
}
