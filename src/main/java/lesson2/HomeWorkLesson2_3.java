package lesson2;

import java.util.Scanner;

/**
 * Created by admin on 02.10.2016.
 */
public class HomeWorkLesson2_3 {
    public static void main(String[] args){
        double i;
        i = getDouble("Enter decimal");

            double j = i % 1;
            int k = (int) i;
            if (j >= 0.5)
                k++;
            if (j<= -0.5)
                k--;
        System.out.println("Rounded value = "+k);
    }

    public static double getDouble (String message){
        double q =0;
        boolean verify;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        do {
            verify = scanner.hasNextDouble();
            if (verify) {
                q = scanner.nextDouble();
            } else {
                System.out.println(message);
                scanner.next();
            }
        } while (verify == false);
        return q;
    }
}
