package bangundatarmain;

/**
 *
 * @author UnggulAdi
 */
public class BangunDatarGeneric<T2212 extends BangunDatar> {
    private T2212 bangundatar;

    public void set(T2212 bangundatar) {
        this.bangundatar = bangundatar;
    }

    public T2212 get() {
        return bangundatar;
    }
    
    public double hitungKeliling() {
        return bangundatar.hitungKeliling();
    }
    
    //Tidak ada masalah jika semua T diganti dengan T2212 karena 
    //T hanya sekedar placeholder untuk class yang akan diisi pada runtime
}
