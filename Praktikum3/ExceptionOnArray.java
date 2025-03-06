/*
 * File 			: ExceptionOnArray.java
 * Deskripsi	    : Program untuk menunjukkan try catch
 * Nama 			: Unggul Adimulia
 * NIM 				: 24060123140145
 * */

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 10;
            arrayInteger[4] = 12;
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("clean up code");
        }
    }
}