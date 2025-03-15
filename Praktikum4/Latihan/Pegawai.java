package org.dosen;

import java.time.LocalDate;

public class Pegawai {
	private String NIP;
	private String nama;
	private int gajiPokok;
	private LocalDate TMT;
	private LocalDate tanggalLahir;

	public Pegawai() {

	}

	public Pegawai(String NIP, String nama, int gajiPokok, LocalDate TMT, LocalDate tanggalLahir) {
		this.NIP = NIP;
		this.nama = nama;
		this.gajiPokok = gajiPokok;
		this.TMT = TMT;
		this.tanggalLahir = tanggalLahir;
	}

	public String getNama() {
		return nama;
	}

	public String getNIP() {
		return NIP;
	}

	public LocalDate getTMT() {
		return TMT;
	}

	public int getGajiPokok() {
		return gajiPokok;
	}

	public LocalDate getTanggalLahir() {
		return tanggalLahir;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setTMT(LocalDate tMT) {
		TMT = tMT;
	}

	public void setNIP(String nIP) {
		NIP = nIP;
	}

	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}

	public void setTanggalLahir(LocalDate tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
}
