/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anabulcollection;

/**
 *
 * @author UnggulAdi
 */
public class KoleksiAnabul<T extends Anabul> {
    private Anabul[] wadah;
    private int nbelmn;
    private int capacity;

    public KoleksiAnabul(int capacity) {
        wadah = new Anabul[capacity];
        this.capacity = capacity;
    }

    public int getNbelmn() {
        return nbelmn;
    }
    
    
    public int getSize() {
        return capacity;
    }

    public void setSize(int capacity) {
        Anabul[] newSize = new Anabul[capacity];
        System.arraycopy(wadah, 0, newSize, 0, this.capacity);
        wadah = newSize;
        this.capacity = capacity;
    }
    
    public Anabul getIsi(int index){
        if (index < 0 || index >= capacity){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + capacity);
        }
        
        return wadah[index];
    }
    
    public void setIsi(int index, Anabul e){
        if (index < 0 || index >= capacity){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + capacity);
        }
        
        wadah[index] = e;
    }
    
    public void add(Anabul e){
        if (nbelmn >= capacity){
            setSize(capacity * 2);
        }
        
        wadah[nbelmn] = e;
        nbelmn++;
    }
    
    public Anabul remove(){
        Anabul temp = wadah[nbelmn-1];
        wadah[nbelmn-1] = null;
        nbelmn--;
        
        return temp;
    }
    
    public void showAll(){
        int i = 0;
        for (int j=0; j < nbelmn; j++) {
            i++;
            System.out.println("element " + i + ": " + wadah[j].getClass().getSimpleName());
            wadah[j].Bersuara();
            wadah[j].Gerak();
        }
    }
}
