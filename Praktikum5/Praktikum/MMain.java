package org.bangundatar;

public class MMain {
	public static void main(String[] args) {
		// BangunDatar B1 = new BangunDatar(); Abstrak Class tidak bisa di instansiate
		BangunDatar P1 = new Persegi(10);
		Persegi P2 = new Persegi((double)Math.sqrt(Math.PI));
		BangunDatar L1 = new Lingkaran(7);
		Lingkaran Li1 = new Lingkaran (1);
		
		System.out.println("Is Equal Luas P1, P2 ? " + P1.isEqualLuas(P2) );
		System.out.println("Is Equal Luas L1, Li1 ? " + L1.isEqualLuas(Li1) );

		Persegi persegi = new Persegi(10);
		System.out.println("Sisi awal persegi: " + persegi.getSisi());
		persegi.zoomIn();
		System.out.println("Sisi setelah zoomIn: " + persegi.getSisi());
		persegi.zoomOut();
		System.out.println("Sisi setelah zoomOut: " + persegi.getSisi());
		persegi.zoomPercent(250);
		System.out.println("Sisi setelah zoom(250%): " + persegi.getSisi());

		Lingkaran lingkaran = new Lingkaran(10);
		System.out.println("\nRadius awal lingkaran: " + lingkaran.getRadius());
		lingkaran.zoomIn();
		System.out.println("Radius setelah zoomIn: " + lingkaran.getRadius());
		lingkaran.zoomOut();
		System.out.println("Radius setelah zoomOut: " + lingkaran.getRadius());
		lingkaran.zoomPercent(200);
		System.out.println("Radius setelah zoom(200%): " + lingkaran.getRadius());
	}
}
