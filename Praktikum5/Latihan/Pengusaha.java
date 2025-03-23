package org.manusia;

/*
	Nama 	: UNGGUL ADIMULIA
	NIM 	: 24060123140145
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
	private String npwp;
	private static int counterPengusaha = 0;

	public Pengusaha() {
		this.npwp = "";
		counterPengusaha += 1;
	}

	public Pengusaha(String nama, LocalDate mulaiKerja, String alaman, double pendapatan, String npwp) {
		super(nama, mulaiKerja, alaman, pendapatan);
		this.npwp = npwp;
		counterPengusaha += 1;
	}

	public String getNpwp() {
		return npwp;
	}

	public static int getCounterPengusaha() {
		return counterPengusaha;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	@Override
	public int hitungMasaKerja() {
		return (int) (ChronoUnit.DAYS.between(getMulaiKerja(), LocalDate.now()) + 4);
	}

	@Override
	public double hitungPajak() {
		return pendapatan * 0.15;
	}
}
