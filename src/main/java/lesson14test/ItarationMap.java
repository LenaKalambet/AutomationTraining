package lesson14test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by stas1 on 24.11.2016.
 */
public class ItarationMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        {
            map.put(0, 00);
            map.put(1, 01);
            map.put(2, 10);
            map.put(3, 11);


            Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Integer> pair = iterator.next();

                Integer key = pair.getKey();
                Integer value = pair.getValue();

                System.out.println(key + "  " + value);
            }
        }
    }
}
