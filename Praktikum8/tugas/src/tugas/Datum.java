package tugas;

public class Datum<T extends Anabul> {
    T isi;

    public Datum(T isi) {
        this.isi = isi;
    }
    
    public void setIsi(T isi) {
        this.isi = isi;
    }

    public T getIsi() {
        return isi;
    }
    
    public void simulasiHewan() {
        isi.Bersuara();
        isi.Gerak();
    }
}
