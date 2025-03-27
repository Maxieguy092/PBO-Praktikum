package org.ruang;

public class RuangDept extends Ruang {
	private int jumlahMeja; 
	private int jumlahKursi;
	private int jumlahLemari;
	private Departemen departemen;

	public RuangDept() {
		this.jumlahMeja = 0;
		this.jumlahKursi = 0;
		this.jumlahLemari = 0;
	}

	public RuangDept(double panjang, double lebar, double tinggi, int capacity, int jumlahMeja, int jumlahKursi, int jumlahLemari, Departemen departemen) {
		super(panjang, lebar, tinggi, capacity);
		this.jumlahMeja = jumlahMeja;
		this.jumlahKursi = jumlahMeja;
		this.jumlahLemari = jumlahLemari;
		this.departemen = departemen;
	}

	public int getJumlahMeja() {
		return jumlahMeja;
	}

	public int getJumlahKursi() {
		return jumlahKursi;
	}

	public int getJumlahLemari() {
		return jumlahLemari;
	}

	public Departemen getDepartemen() {
		return departemen;
	}

	public void setJumlahMeja(int jumlahMeja) {
		this.jumlahMeja = jumlahMeja;
	}

	public void setJumlahKursi(int jumlahKursi) {
		this.jumlahKursi = jumlahKursi;
	}

	public void setJumlahLemari(int jumlahLemari) {
		this.jumlahLemari = jumlahLemari;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Jumlah Meja			: "+jumlahMeja);
		System.out.println("Jumlah kursi			: "+jumlahKursi);
		System.out.println("Jumlah Lemari			: "+jumlahLemari);
		System.out.println("Tarif Kebersihan		: "+ hitungTarif());
	}

	@Override
	public double hitungTarif() {
		return getPanjang() * getLebar() * departemen.getTarifRuang();
	}
}
