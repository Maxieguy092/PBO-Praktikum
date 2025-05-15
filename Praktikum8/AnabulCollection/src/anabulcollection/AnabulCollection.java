package anabulcollection;

/**
 *
 * @author UnggulAdi
 */
public class AnabulCollection {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksi = new KoleksiAnabul<>(5);

        koleksi.add(new Anjing("Bobby"));
        koleksi.add(new Kucing("Mimi"));
        koleksi.add(new Burung("Coco"));
        koleksi.add(new Kucing("Luna"));
        koleksi.add(new Anjing("Rex"));
        koleksi.add(new Burung("Rio"));
        koleksi.add(new Anjing("Max"));
        koleksi.add(new Kucing("Kitty"));
        koleksi.add(new Burung("Piko"));
        koleksi.add(new Anjing("Rocky"));

        koleksi.showAll();
    }
}
