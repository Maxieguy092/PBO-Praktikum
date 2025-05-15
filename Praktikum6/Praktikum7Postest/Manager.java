package org.example;

public class Manager extends Pegawai {
	private int tanjungan = 700000;

	public Manager (String nama) {
		super.setNama(nama);
	}

	@Override
	public void tampilData() {
		super.tampilData();
		System.out.println("Tanjungan : "+tanjungan);
	}
}
