package org.example;

public class Pegawai {
	private String nama;
	private int gajiPokok = 5000000;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void tampilData() {
		System.out.print("NAMA	: " + nama);
		System.out.println(", Gaji	: " + gajiPokok);
	}

	//Manfaat dari polimorfisme dalam kasus ini adalah kemampuan untuk membuat 
	//kehidupan kita sebagai programmer lebih gampang karena memfasilitasi code reuse
	//dan mempergampang handling data jika tidak ada polimorfisme maka semua subclass 
	//pegawai harus di store di list berbeda dan menggunakan fungsi tampilan berbeda
	//sedangkan mereka punya beberapa data yg sama

	//Jika ada pegawai4 dan pegawai5 dua-duanya bertipe beda maka tanpa polimorfisme
	//dalam program ini pegawai4 dan 5 harus di store pada list berbeda 
	//dan memiliki fungsi untuk menampilkan info berbeda 
}
