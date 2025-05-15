package arraylisttest;

import java.util.*;

/**
 *
 * @author UnggulAdi
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add("Praktikum");
        strings.add("collection");
        strings.add("dan generics");
        
        strings.remove("Praktikum");
        
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }
    
}
