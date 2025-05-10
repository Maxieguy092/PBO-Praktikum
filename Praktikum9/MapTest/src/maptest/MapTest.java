package maptest;
import java.util.*;

/**
 *
 * @author UnggulAdi
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "Satu");
        map.put(2, "Dua");

        System.out.println(map.get(1));
        
        Set<Integer> key = map.keySet();
        
        for (Integer i : key) {
            System.out.println(map.get(i));
        }
    }
    
}
