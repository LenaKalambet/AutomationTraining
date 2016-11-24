package homeWorkLesson13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by stas1 on 17.11.2016.
 */
public class MinInt {

        public static void main(String[] args) throws Exception {
            List<Integer> integerList = getIntegerList();
            System.out.println(getMinimum(integerList));
        }

        public static int getMinimum(List<Integer> list) {
            int min = list.get(0);
            for(Integer qwe:list){
                if (qwe<min){
                    min = qwe;
                }
            }
            return min;
        }

        public static List<Integer> getIntegerList() throws IOException {
           List<Integer> list = new ArrayList<>();
            int n;
            do {
                n = getInt("Enter length: ");
            } while (n<=0);
            for (int i =0; i<n;i++){
                list.add(getInt("Enter new value:"));

            }
            return list;
        }

    public static int getInt (String message) throws IOException {
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
