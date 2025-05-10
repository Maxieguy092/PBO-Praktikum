/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatarmain;

import java.util.AbstractList;
import java.util.List;

/**
 *
 * @author UnggulAdi
 */
public class KoleksiBangunDatar<T extends BangunDatar>{
    private BangunDatar[] wadah;
    private int nbelmn;
    private int capacity;

    public KoleksiBangunDatar(int capacity) {
        wadah = new BangunDatar[capacity];
        this.capacity = capacity;
    }

    public int getNbelmn() {
        return nbelmn;
    }
    
    
    public int getSize() {
        return capacity;
    }

    public void setSize(int capacity) {
        BangunDatar[] newSize = new BangunDatar[capacity];
        System.arraycopy(wadah, 0, newSize, 0, this.capacity);
        wadah = newSize;
        this.capacity = capacity;
    }
    
    public BangunDatar getIsi(int index){
        if (index < 0 || index >= capacity){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + capacity);
        }
        
        return wadah[index];
    }
    
    public void setIsi(int index, BangunDatar e){
        if (index < 0 || index >= capacity){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + capacity);
        }
        
        wadah[index] = e;
    }
    
    public void add(BangunDatar e){
        if (nbelmn >= capacity){
            setSize(capacity * 2);
        }
        
        wadah[nbelmn] = e;
        nbelmn++;
    }
    
    public BangunDatar remove(){
        BangunDatar temp = wadah[nbelmn-1];
        wadah[nbelmn-1] = null;
        nbelmn--;
        
        return temp;
    }
    
    public void showAll(){
        int i = 0;
        for (int j=0; j < nbelmn; j++) {
            i++;
            System.out.println("element " + i + ": " + wadah[j].getClass().getSimpleName());
        }
    }
}
