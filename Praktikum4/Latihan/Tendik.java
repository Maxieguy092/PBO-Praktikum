package org.dosen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Tendik extends Pegawai {
	private LocalDate BUP;
	private String bidangTempatKerja;
	
	public Tendik () {

	} 

	public Tendik (String NIP, String nama, int gajiPokok, LocalDate TMT, LocalDate tanggalLahir, String bidangTempatKerja) {
		super(NIP, nama, gajiPokok, TMT, tanggalLahir);
		this.bidangTempatKerja = bidangTempatKerja;
		this.BUP = tanggalLahir.plusYears(65).plusMonths(1).with(TemporalAdjusters.firstDayOfMonth());
	}

	public LocalDate getBUP() {
		return BUP;
	}

	public String getBidangTempatKerja() {
		return bidangTempatKerja;
	}

	public void setBUP(LocalDate bUP) {
		BUP = bUP;
	}

	public void setBidangTempatKerja(String bidangTempatKerja) {
		this.bidangTempatKerja = bidangTempatKerja;
	}

	public void displayInfo() {
		System.out.println("NIP				: " + super.getNIP());
		System.out.println("Nama				: " + super.getNama());

		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd MMM YYYY");

		System.out.println("Tanggal Lahir			: " + DTF.format(super.getTanggalLahir()));
		System.out.println("TMT				: " + DTF.format(super.getTMT())); // Towa Maji Tenshi
		System.out.println("Jabatan				: Tendik ");
		System.out.println("Bidang Tempat Kerja		: " + getBidangTempatKerja());
		System.out.println("Gaji Pokok			: " + super.getGajiPokok());

		long masakerjaTHN = ChronoUnit.YEARS.between(getTMT(), LocalDate.now());
		long masakerjaBLN = ChronoUnit.MONTHS.between(getTMT().plusYears(masakerjaTHN), LocalDate.now());

		System.out.println("Masa Kerja			: " + masakerjaTHN + " Tahun " + masakerjaBLN + " Bulan ");
		System.out.println("BUP				: " + DTF.format(getBUP()));
		
		double tnj = 0.01 * getGajiPokok();
		System.out.println("Tunjangan			: " + "1% x " + getGajiPokok() + " = " + tnj);
	}
}
