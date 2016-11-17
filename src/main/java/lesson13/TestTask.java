package lesson13;

import java.util.*;

/**
 * Created by stas1 on 11.11.2016.
 */
public class TestTask {

    public static void main(String[] args) {
        int k =0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<10;i++) {
            arrayList.add(getInt("Please enter some value"));
        }
        Map<Integer,Integer> map = new HashMap<>();
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();

        
        for (int j =0; j<10; j++) {
            for (int i = 0; i <10; i++) {
                if (arrayList.get(j) == arrayList.get(i)) {
                    k++;
                }

            }
            map.put(arrayList.get(j), k);
        }




        while (iterator.hasNext())
        {
            Map.Entry<Integer,Integer> pair = iterator.next();

            Integer key = pair.getKey();
            Integer value = pair.getValue();

            System.out.println(key+"  "+value);
        }



    }






    public static int getInt (String message) {
        int q = 0;
        boolean verify;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        do {
            verify = scanner.hasNextInt();
            if (verify) {
                q = scanner.nextInt();
            } else {
                System.out.println(message);
                scanner.next();
            }
        } while (verify == false);
        return q;
    }
}
