package tugas;

public class ContohMetodeGenerik<D extends Datum> {
    D isi;

    public ContohMetodeGenerik(D isi) {
        this.isi = isi;
    }
    
    public <D extends Datum> void simulasiDatum() {
        isi.simulasiHewan();
    }
}
