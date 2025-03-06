/*
 * File 			: AngkaSial.java
 * Deskripsi	    : Coba Exception buatan sendiri
 * Nama 			: Unggul Adimulia
 * NIM 				: 24060123140145
 * */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }

        System.out.println("Angka tidak sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(15);
        } catch (AngkaSialException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Angka Engkau Sial");
        }

        /*
			JAWABAN 3.4 : Jika Exception terjadi maka line setelah throw tidak akan dijalankan 
            dan line-line yang di dalam try block setelah method yang melempar exception tidak 
            akan dijalankan block catch dijalankan.


		*/
    }
}