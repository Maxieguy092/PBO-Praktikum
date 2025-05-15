package bangundatarmain;

/**
 *
 * @author UnggulAdi
 * Tugas juga sekalian di folder ini
 */
public class BangunDatarGenericMain {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : "
                           + bdg.hitungKeliling());
        System.out.println("tipe generic : "
                           + bdg.get().getClass().getName());
        
        KoleksiBangunDatar<BangunDatar> koleksi = new KoleksiBangunDatar<>(10);

        BangunDatar bd1 = new Persegi(4);
        BangunDatar bd2 = new Lingkaran(3);
        BangunDatar bd3 = new Segitiga(3, 4);
        BangunDatar bd4 = new Persegi(5);
        BangunDatar bd5 = new Lingkaran(2.5);
        BangunDatar bd6 = new Segitiga(6, 2);
        BangunDatar bd7 = new Persegi(7);
        BangunDatar bd8 = new Lingkaran(1.5);
        BangunDatar bd9 = new Segitiga(5, 5);
        BangunDatar bd10 = new Persegi(2);

        koleksi.add(bd1);
        koleksi.add(bd2);
        koleksi.add(bd3);
        koleksi.add(bd4);
        koleksi.add(bd5);
        koleksi.add(bd6);
        koleksi.add(bd7);
        koleksi.add(bd8);
        koleksi.add(bd9);
        koleksi.add(bd10);

        System.out.println("Jumlah elemen: " + koleksi.getNbelmn());
        koleksi.showAll();
        System.out.println(koleksi.getNbelmn());
        koleksi.add(new Segitiga(2.0, 2.0));
        koleksi.showAll();
        
        System.out.println("===REMOVE===");
        koleksi.remove();
        koleksi.remove();
        koleksi.showAll();
        
        System.out.println("===Set Get===");
        BangunDatar d = koleksi.getIsi(3);
        System.out.println(d.hitungLuas() + " " + d.toString());
        
        koleksi.setIsi(3, new Segitiga(2.0, 1.0));
        BangunDatar d2 = koleksi.getIsi(3);
        System.out.println(d2.hitungLuas() + " " + d2.toString());

    }
}
