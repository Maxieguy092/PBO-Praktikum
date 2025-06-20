/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambda;

import java.util.HashMap;
import java.util.Map;

public class Lambda {
    public static void main(String[] args) {
        IDiskon diskonLebaran = (harga) -> harga - (0.1 * harga);
        IDiskon diskonBiasa = (harga) -> harga - (0.02 * harga);

        double hargaProduk = 45000;

        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(hargaProduk));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(hargaProduk));        

        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("18062001", "Adi");
        mahasiswa.put("18062002", "Bambang");
        mahasiswa.put("18062003", "Cici");
        mahasiswa.put("18062004", "Diddy");

        mahasiswa.forEach((nim, nama) ->
            System.out.println("NIM: " + nim + "  =>  Nama: " + nama)
        );
    }
}