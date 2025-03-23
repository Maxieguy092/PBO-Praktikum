package org.manusia;

/*
	Nama 	: UNGGUL ADIMULIA
	NIM 	: 24060123140145
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
	private String asalKota;
	private static int counterPetani = 0;

	public Petani() {
		this.asalKota = "";
		counterPetani += 1;
	}

	public Petani(String nama, LocalDate mulaiKerja, String alaman, double pendapatan, String asalKota) {
		super(nama, mulaiKerja, alaman, pendapatan);
		this.asalKota = asalKota;
		counterPetani += 1;
	}

	public String getAsalKota() {
		return asalKota;
	}

	public static int getCounterPetani() {
		return counterPetani;
	}

	public void setAsalKota(String asalKota) {
		this.asalKota = asalKota;
	}

	@Override
	public int hitungMasaKerja() {
		return (int) (ChronoUnit.DAYS.between(getMulaiKerja(), LocalDate.now()));
	}

	@Override
	public double hitungPajak() {
		return 0;
	}
}
