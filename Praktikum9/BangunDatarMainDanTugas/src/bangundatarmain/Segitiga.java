/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatarmain;

/**
 *
 * @author UnggulAdi
 */
public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + miring;
    }
    
    
}
