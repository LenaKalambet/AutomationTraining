package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 03.10.2016.
 */
public class Task1 {
    public static void main(String[] args){
        int a,b,c,d;
        a = getInt("First int value");
        b = getInt("Second int value");
        c = getInt("Third int value");
        d = getInt("Forth int value");

        if (a<=b && a<=c && a<=d){
           System.out.println (a);
        }
        if (b<=a && b<=c && b<=d){
            System.out.println (b);
        }
        if (c<=a && c<=b && c<=d){
            System.out.println (c);
        }
        if (d<=a && d<=b && d<= c) {
            System.out.println (c);
        }


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
