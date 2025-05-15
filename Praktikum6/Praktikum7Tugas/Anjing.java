package org.example;

public class Anjing extends Anabul {
	
	public Anjing (String nama) {
		super.setNama(nama);
	}

	@Override
	public void Gerak() {
		System.out.println("Melata");
	}

	@Override
	public void Bersuara() {
		System.out.println("Guk");
	}
}
