package org.asersi;

/*
 * File 			:Asersi1.java
 * Deskripsi	:Program untuk menunjukkan asersi
 * Nama 			: Unggul Adimulia
 * NIM 				: 24060123140145
 * */

public class Asersi1 {
	public static void main(String[] args){
		int x = 0;
		if (x>0) {
			System.out.println("x Is Positive");
		} else {
			assert(x<0);
			System.out.println("x Is Negative");
		}
	}
}
