/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatarmain;

/**
 *
 * @author UnggulAdi
 */
public class Lingkaran extends BangunDatar{
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    
    @Override
    public double hitungLuas() {
        return 3.14 * jarijari * jarijari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jarijari * 3.14;
    }
}
