package org.example;

public class Main {
	public static void main(String[] args) {
		Vehicle kendaraan = new Vehicle();
		Vehicle mobil = new Car();
		Vehicle bis = new Bus();

		kendaraan.calRent(50, 1000); 
		mobil.calRent(50, 1000); // Memanggil calrent mobil
		bis.calRent(50, 1000); // Memanggil calrent superclass
	}
}
