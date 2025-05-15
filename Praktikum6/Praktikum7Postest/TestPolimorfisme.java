package org.example;

import java.util.ArrayList;

public class TestPolimorfisme {

	public static void main(String[] args) {

		Pegawai pegawai = new Programmer("Mira");
		Pegawai pegawai2 = new Manager("Joko");
		Manager pegawai3 = new Manager("Argo");

		ArrayList<Pegawai> emps = new ArrayList<>();
		emps.add(pegawai);
		emps.add(pegawai2);
		emps.add(pegawai3);

		System.out.println("NAMA : UNGGUL ADIMULIA \nNIM : 24060123140145 \n");
		for (Pegawai emp : emps) {
			emp.tampilData();
		}
	}
}
