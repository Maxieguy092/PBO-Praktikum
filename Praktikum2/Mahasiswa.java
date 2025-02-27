package org.mahasiswa;

/*
 * Nama File : Mahasiswa.java
 * Deskripsi : Atribut dan Method dalam class Mahasiswa
 * Pembuat   : Unggul Adimulia 
 * NIM       : 24060123140145
 * Tanggal   : 27-02-2025
 * */

import java.util.ArrayList;

import org.dosen.Dosen;
import org.kendaraan.Kendaraan;
import org.matakuliah.MataKuliah;

public class Mahasiswa {
	private String nim;
	private String nama;
	private String prodi;
	public ArrayList<MataKuliah> listMatkul;
	private Dosen dosenWali;
	private Kendaraan kendaraan;

	public Mahasiswa() {
		this.nim = "NIL";
		this.nama = "NIL";
		this.prodi = "NIL";
		this.listMatkul = new ArrayList<>();
		this.dosenWali = new Dosen();
		this.kendaraan = new Kendaraan();
	}

	public Mahasiswa(String nim, String nama, String prodi) {
		this.nim = nim; 
		this.nama = nama; 
		this.prodi = prodi; 
		this.listMatkul = new ArrayList<>();
		this.dosenWali = new Dosen();
		this.kendaraan = new Kendaraan();
	}

	public String getNim() {
		return nim;
	}

	public String getNama() {
		return nama;
	}

	public String getProdi() {
		return prodi;
	}

	public Dosen getDosenWali() {
		return dosenWali;
	}

	public Kendaraan getKendaraan() {
		return kendaraan;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	public void setDosenWali(Dosen DosenWali) {
		this.dosenWali = DosenWali;
	}

	public void setKendaraan(Kendaraan kendaraan) {
		this.kendaraan = kendaraan;
	}

	public void addMatKul(MataKuliah matkul) {
		listMatkul.add(matkul);
	}

	public int getJumlahSks() {
		int jumlah = 0;

		for(int i = 0; i < listMatkul.size(); i++) {
			jumlah += listMatkul.get(i).getSks();
		}

		return jumlah;
	}

	public int getJumlahMatkul() {
		return listMatkul.size();
	}

	public void printMhs() {
		System.out.println("Nama : " + nama);
		System.out.println("NIM : " + nim);
		System.out.println("Prodi : " + prodi);
	}

	public void printDetailMhs() {
		printMhs();
		System.out.println("Nama Dosen Wali : " + dosenWali.getNama());
		System.out.println("NIP Dosen Wali : " + dosenWali.getNIP());
		System.out.println("Kendaraan : " + kendaraan.getJenis());
		System.out.println("NO PlAT : " + kendaraan.getNoPlat());

		for(int i = 0;i < listMatkul.size();i++){
			System.out.println(listMatkul.get(i).getNama());
		}
	}
}
