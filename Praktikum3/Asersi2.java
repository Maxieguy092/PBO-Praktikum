/*
 * File 			: Asersi2.java
 * Deskripsi	    : Program untuk menunjukkan asersi
 * Nama 			: Unggul Adimulia
 * NIM 				: 24060123140145
 * */

class Lingkaran {
	private double jariJari;
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}

	public double hitungKeliling() {
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0) : "Jari Jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran); 

		/*
			JAWABAN 3.2 : Message assertionnya seharusnya Jari Jari tidak boleh negatif.
			jika kita mau nge-cek jari jari = 0 maka assert harus di ganti jadi assert(jarijari == 0).
		*/
    }
}