package org.ruang;

public class RuangDosen extends Ruang {
	private String namaDosen;
	private int jumlahKursi;
	private int jumlahMeja;
	private Departemen departemen;

	public RuangDosen() {
		this.namaDosen = "TEMPNAME";
		this.jumlahKursi = 0;
		this.jumlahMeja = 0;
	}

	public RuangDosen(double panjang, double lebar, double tinggi, int capacity, String namaDosen, int jumlahKursi,
			int jumlahMeja, Departemen departemen) {
		super(panjang, lebar, tinggi, capacity);
		this.namaDosen = namaDosen;
		this.jumlahKursi = jumlahKursi;
		this.jumlahMeja = jumlahMeja;
		this.departemen = departemen;
	}

	public String getNamaDosen() {
		return namaDosen;
	}

	public int getJumlahMeja() {
		return jumlahMeja;
	}

	public int getJumlahKursi() {
		return jumlahKursi;
	}

	public Departemen getDepartemen() {
		return departemen;
	}

	public void setNamaDosen(String namaDosen) {
		this.namaDosen = namaDosen;
	}

	public void setJumlahKursi(int jumlahKursi) {
		this.jumlahKursi = jumlahKursi;
	}

	public void setJumlahMeja(int jumlahMeja) {
		this.jumlahMeja = jumlahMeja;
	}

	public void setDepartemen(Departemen departemen) {
		this.departemen = departemen;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Nama Dosen			: " + namaDosen);
		System.out.println("Jumlah Kursi			: " + jumlahKursi);
		System.out.println("Jumlah Meja			: " + jumlahMeja);
		System.out.println("Departemen			: " + departemen.getNamaDept());
		System.out.println("Tarif Kebersihan		: " + hitungTarif());
	}

	@Override
	public double hitungTarif() {
		return getPanjang() * getLebar() * departemen.getTarifRuang();
	}

}
