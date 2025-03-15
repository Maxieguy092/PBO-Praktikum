package org.dosen;

import java.time.LocalDate;

public class MMain {
	public static void main(String[] args) {
		Dosen dosen = new Dosen("1234", "Huss", 5000000, LocalDate.of(2015, 01, 01), LocalDate.of(1993, 01, 02), "23456", "Fakultas Teknik");
		dosen.displayInfo();

		System.out.println("");

		DosenTamu dosenTamu = new DosenTamu("123422", "Russel Crow", 5250000, LocalDate.of(2011, 01, 01), LocalDate.of(1993, 01, 01), "23456", LocalDate.of(2018, 1, 1) , "Fakultas Seni dan Budaya");

		dosenTamu.displayInfo();

		System.out.println("");

		Tendik tendik = new Tendik("776611", "Gandalf", 1000000, LocalDate.of(1998, 07, 05), LocalDate.of(1982, 12, 18), "Middle Earth");
		tendik.displayInfo();
	}
}
