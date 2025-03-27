package org.ruang;

public class RuangKelas extends Ruang {
	private int jumlahKursi;
	private int jumlahKursiRsk;
	private double tarifKelas;

	public RuangKelas() {
		this.jumlahKursi = 0;
		this.jumlahKursiRsk = 0;
		this.tarifKelas = 0.0;
	}

	public RuangKelas(double panjang, double lebar, double tinggi, int capacity, int jumlahKursi, int jumlahKursiRsk,
			double tarifKelas) {
		super(panjang, lebar, tinggi, capacity);
		this.jumlahKursi = jumlahKursi;
		this.jumlahKursiRsk = jumlahKursiRsk;
		this.tarifKelas = tarifKelas;
	}

	public int getJumlahKursi() {
		return jumlahKursi;
	}

	public int getJumlahKursiRsk() {
		return jumlahKursiRsk;
	}

	public double getTarifKelas() {
		return tarifKelas;
	}

	public void setJumlahKursi(int jumlahKursi) {
		this.jumlahKursi = jumlahKursi;
	}

	public void setJumlahKursiRsk(int jumlahKursiRsk) {
		this.jumlahKursiRsk = jumlahKursiRsk;
	}

	public void setTarifKelas(double tarifKelas) {
		this.tarifKelas = tarifKelas;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Jumlah Kursi			: " + jumlahKursi);
		System.out.println("Jumlah Kursi Rusak		: " + jumlahKursiRsk);
		System.out.println("Tarif Kebersihan		: " + hitungTarif());
	}

	@Override
	public double hitungTarif() {
		return getPanjang() * getLebar() * tarifKelas;
	}
}
