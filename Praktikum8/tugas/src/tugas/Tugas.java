package tugas;

public class Tugas {
    
    public static void main(String[] args) {
        Anabul anjing = new Anjing("Korone");
        
        Datum<Anabul> datum = new Datum<Anabul>(anjing);
        ContohMetodeGenerik<Datum> contohmetodegenerik = new  ContohMetodeGenerik<Datum>(datum);
        
        contohmetodegenerik.simulasiDatum();
    }
    
}
