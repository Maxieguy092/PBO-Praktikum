/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maindao;

import java.io.*;

/**
 *
 * @author UnggulAdi
 */
public class Person implements Serializable {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int id, String n) {
        this.id = id;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
