/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import java.util.*;
import jdbc.utilities.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author UnggulAdi
 */
public class CollectionBasisData {
    	public static void displayAll (List<?> items) {
        	for (Object item : items) {
        	    System.out.println(item.toString());
        	}
	}
	
	static MysqlMahasiswaService service = new MysqlMahasiswaService();
    	public static void main(String[] args) {
        	List<Mahasiswa> listmhs = new ArrayList<>();
        	System.out.println("");

	        // insert
        	System.out.println("===insert===");
       	 	Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        	service.add(mhsAdd);
        	System.out.println("berhasil insert : " + mhsAdd);
        	displayAll(listmhs);

        	// update
        	System.out.println("===update===");
        	Mahasiswa mhsUpdate = service.getById(5);
        	System.out.println("Akan diupdate data lama : " + mhsUpdate);
        	mhsUpdate.setNama("Dhinaya");
       	 	System.out.println("dengan data baru : " + mhsUpdate);
        	service.update(mhsUpdate);
        	displayAll(listmhs);

        	// delete
        	System.out.println("===delete===");
        	System.out.println("Akan di delete : " + service.getById(5));
        	service.delete(5);
        	displayAll(listmhs);
    	}	
	
}
