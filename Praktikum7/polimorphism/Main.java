package org.polimorphism;

public class Main {
	public static void main(String[] args) {
		int output = 'a';
		System.out.println(output);
		// Berhasil karena char bisa di konvert secara langsung ke int

		double x = 15.5;
		//int output2 = x;
		//System.out.println(output2);
		// gagal karena java tidak bisa secara langsung mengonversi double ke int

		int y = 25;
		double output3 = y;
		System.out.println(output3);
		// Berhasil karena java melakukan type casting secara implisit dari int ke
		// double

		int z = 78;
		char output4 = (char) z;
		System.out.println(output4);
		// Berhasil karena kita melakukan type casting sebelum di assign ke output4

		char a = 'a';
		double output5 = a;
		System.out.println(output5);
		// Char pada dasarnya adalah sebuah integer 8-bit jadi sama seperti di kasus int
		// ke double
		// java melakukan type cast implicit
	}
}
