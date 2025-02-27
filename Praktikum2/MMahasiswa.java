package org.MMahasiswa;

/*
 * Nama File : MMahasiswa.java
 * Deskripsi : Main Class untuk praktikum 2 bagian relasi
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 27-02-2025
 * */

import org.dosen.Dosen;
import org.kendaraan.Kendaraan;
import org.mahasiswa.Mahasiswa;
import org.matakuliah.MataKuliah;

public class MMahasiswa {
	public static void main(String[] args) {
		MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
		MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
		Mahasiswa M1 = new Mahasiswa("1234", "Unggul Adi", "Informatika");
		Dosen D1 = new Dosen("1234", "Ahdi", "Informatika");

		Kendaraan K1 = new Kendaraan("B2222KJI", "Mobil");
		M1.setDosenWali(D1);
		M1.setKendaraan(K1);
		M1.addMatKul(PBO);
		M1.addMatKul(MBD);
		M1.printDetailMhs();
		System.out.println("Jumlah Matkul : " + M1.getJumlahMatkul());
		System.out.println("Jumlah SKS : " + M1.getJumlahSks());
	}
}
