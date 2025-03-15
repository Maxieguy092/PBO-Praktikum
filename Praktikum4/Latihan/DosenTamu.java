package org.dosen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DosenTamu extends Pegawai{
	private String NIDK;
	private LocalDate TAT;
	private String fakultas;
	private double tanjungan;

	public DosenTamu () {

	}

	public DosenTamu (String NIP, String nama, int gajiPokok, LocalDate TMT, LocalDate tanggalLahir, String NIDK, LocalDate TAT ,String fakultas) {
		super(NIP, nama, gajiPokok, TMT, tanggalLahir);
		this.NIDK = NIDK;
		this.TAT = TAT;
		this.fakultas = fakultas;
	}

	public String getNIDK() {
		return NIDK;
	}

	public LocalDate getTAT() {
		return TAT;
	}

	public String getFakultas() {
		return fakultas;
	}

	public double getTanjungan() {
		return tanjungan;
	}

	public void setNIDK(String nIDK) {
		NIDK = nIDK;
	}

	public void setTAT(LocalDate tAT) {
		TAT = tAT;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}

	public void displayInfo(){
		System.out.println("NIP				: " + super.getNIP());
		System.out.println("NIDN				: " + getNIDK());
		System.out.println("Nama				: " + super.getNama());

		DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd MMM YYYY");

		System.out.println("Tanggal Lahir			: " + DTF.format(super.getTanggalLahir()));
		System.out.println("TMT				: " + DTF.format(super.getTMT())); // Towa Maji Tenshi
		System.out.println("TAT				: " + DTF.format(getTAT()));
		System.out.println("Jabatan				: Dosen Tamu");
		System.out.println("Fakultas			: " + getFakultas());
		System.out.println("Gaji Pokok			: " + super.getGajiPokok());

		long masakerjaTHN = ChronoUnit.YEARS.between(getTMT(), getTAT());
		long masakerjaBLN = ChronoUnit.MONTHS.between(getTMT().plusYears(masakerjaTHN), getTAT());

		System.out.println("Masa Kerja			: " + masakerjaTHN + " Tahun " + masakerjaBLN + " Bulan ");

		double tnj = 0.025 * getGajiPokok();
		System.out.println("Tunjangan			: " + "2,5% x " + getGajiPokok() + " = " + tnj);
	}
}
