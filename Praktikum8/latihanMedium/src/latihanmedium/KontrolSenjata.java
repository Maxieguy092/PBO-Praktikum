package latihanmedium;

public class KontrolSenjata {
    Senjata s;

    public KontrolSenjata(Senjata s) {
        this.s = s;
    }
    
    public boolean isAdaPeluru(){
        return s.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        s.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah : " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        if (s.getPeluru() <= 0) {
            System.out.println("Peluru Habis");
            return;
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print(s.getBunyi() + " ");
            if (s.getPeluru() <= 0) {
                System.out.print("Gagal tembak, Peluru habis. ");
                continue;
            }
            s.setPeluru(s.getPeluru() - 1);
        }
        
        System.out.println("");
        System.out.println("Peluru Sisa : " + s.getPeluru());
    }

    public void pasangBayonet() {
        s.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (s.isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
