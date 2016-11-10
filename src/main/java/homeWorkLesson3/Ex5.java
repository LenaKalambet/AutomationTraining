package homeWorkLesson3;

import java.util.Scanner;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex5 {
    public static void main(String[] args) {
        int month = getInt("Enter month number:");
        switch (month / 3) {
            case 0:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Winter");
                break;
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
