package lesson2;

import java.util.Scanner;

/**
 * Created by admin on 02.10.2016.
 */
public class HomeWorkLesson2_1 {
    public static void main(String[] args){
        int q,w;
        q = getInt("Enter value for q: ");
        do {
        w = getInt("Enter value for w: ");

        if (w == 0) {
            System.out.println("w shouldn't be equal to zero.");
            w = getInt("Enter value for w: ");
        }}
        while (w == 0);
        int i = q / w;
        int j = q % w;
        System.out.println(q+"/"+w+" = "+i+" and "+j+" rest.");
    }

    public static int getInt (String message){
        int q =0;
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
