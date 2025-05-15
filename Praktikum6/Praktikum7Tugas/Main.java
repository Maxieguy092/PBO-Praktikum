package org.example;

public class Main {
	public static void main(String[] args) {
		Anabul kucing = new Kucing("Ao");
		Anabul anjing = new Anjing("Hio");
		Anabul burung = new Burung("Doshi");

		//overloading
		kucing.Gerak();
		kucing.Bersuara();
		anjing.Gerak();
		anjing.Bersuara();
		burung.Gerak();
		burung.Bersuara();

		//Corercion
		burung = new Anjing("Polka");
		burung.Bersuara();
		burung.Gerak();
	}
}
