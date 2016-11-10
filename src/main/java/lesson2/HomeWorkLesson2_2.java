package lesson2;

import java.util.Scanner;

/**
 * Created by admin on 02.10.2016.
 */
public class HomeWorkLesson2_2 {
    public static void main (String[] args){
        int i;

        do{
            i = getInt ("Enter natural 2-digits value: ");
            if (i>9 && i<100)
            {   int k,n;
                k = i / 10;
                n = i % 10;
                k = k + n;
                System.out.println("Sum of decimals is "+k);
            }
            else
            {System.out.println("Incorrect 2-digits natural value. Try again");}
        }
        while(i<=9 || i>=100);
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
