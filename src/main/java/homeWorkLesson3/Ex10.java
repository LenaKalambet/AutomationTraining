package homeWorkLesson3;

import java.util.Scanner;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex10 {
    public static void main(String[] args) {
        int f = 1;
        int i = getInt("Enter positive integer value: ");
        if (i > 0) {
            for (; i > 0; i--) {
                f = f * i;
            }
            System.out.println("Factorial: " + f);
        } else {
            for (; i < 0; i++) {
                f = f * i;
            }
            System.out.println("Factorial: " + f);
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
