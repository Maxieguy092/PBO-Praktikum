package org.dosen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Dosen extends Pegawai {
	private String NIDN;
	private LocalDate BUP;
	private int tunjangan;
	private String fakultas;
	private Long masaKerjaTHN;
	private Long masaKerjaBLN;

	public Dosen() {

	}

	public Dosen(String NIP, String nama, int gajiPokok, LocalDate TMT, LocalDate tanggalLahir, String NIDN,
			String fakultas) {
		super(NIP, nama, gajiPokok, TMT, tanggalLahir);
		this.NIDN = NIDN;
		this.fakultas = fakultas;
		this.BUP = tanggalLahir.plusYears(65).plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
		this.masaKerjaTHN = ChronoUnit.YEARS.between(TMT, LocalDate.now());
		this.masaKerjaBLN = ChronoUnit.MONTHS.between(TMT.plusYears(getMasaKerjaTHN()), LocalDate.now());
	}

	public String getNIDN() {
		return NIDN;
	}

	public LocalDate getBUP() {
		return BUP;
	}

	public int getTunjangan() {
		return tunjangan;
	}

	public Long getMasaKerjaTHN() {
		return masaKerjaTHN;
	}

	public Long getMasaKerjaBLN() {
		return masaKerjaBLN;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setNIDN(String NIDN) {
		this.NIDN = NIDN;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	public void displayInfo() {
		System.out.println("NIP				: " + super.getNIP());
		System.out.println("NIDN				: " + getNIDN());
		System.out.println("Nama				: " + super.getNama());

		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd MMM yyyy");

		System.out.println("Tanggal Lahir			: " + DTF.format(super.getTanggalLahir()));
		System.out.println("TMT				: " + DTF.format(super.getTMT())); // Towa Maji Tenshi
		System.out.println("Jabatan				: Dosen Tetap");
		System.out.println("Fakultas			: " + getFakultas());
		System.out.println("Masa Kerja			: " + getMasaKerjaTHN() + " Tahun " + getMasaKerjaBLN() + " Bulan ");
		System.out.println("BUP				: " + DTF.format(getBUP()));
		System.out.println("Gaji Pokok			: " + super.getGajiPokok());
		double tnj = 0.02 * getMasaKerjaTHN() * getGajiPokok();
		System.out.println("Tunjangan			: " + "2% x " + getMasaKerjaTHN() + " x " + getGajiPokok() + " = " + tnj);
	}
}
