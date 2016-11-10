package lesson2;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by admin on 02.10.2016.
 */
public class HomeWorkLesson2_4 {
    public static void main(String[] args){
        int i,k,n;
        n = 0;
        k = 1;
        i = getInt("Enter integer value");
        i = Math.abs(i);
        while (k>0)
            {
                k = i / 10;
                int m = i%10;
                i = i-m;
                n = n+m;
                i = i/10;
            }

            System.out.println(n);

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
