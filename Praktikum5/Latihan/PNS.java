package org.manusia;

/*
	Nama 	: UNGGUL ADIMULIA
	NIM 	: 24060123140145
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
	private String nip;
	private static int counterPns = 0;

	public PNS() {
		counterPns += 1;
	}

	public PNS(String nama, LocalDate mulaiKerja, String alamat , double pendapatan, String nip) {
		super(nama, mulaiKerja,alamat, pendapatan);
		this.nip = nip;
		counterPns += 1;
	}

	public String getNip() {
		return nip;
	}

	public static int getCounterPNS() {
		return counterPns;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	@Override
	public int hitungMasaKerja() {
		return (int) (ChronoUnit.DAYS.between(getMulaiKerja(), LocalDate.now()) + 5);
	}

	@Override
	public double hitungPajak() {
		return pendapatan * 0.1;
	}

	@Override
	public void cetakInfo() {
		super.cetakInfo();
		System.out.println("NIP : " + nip);
		System.out.println("Jumlah PNS : " + counterPns);
	}
}
