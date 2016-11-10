package lesson3;

import java.util.Scanner;

/**
 * Created by admin on 03.10.2016.
 */
public class WeekDays {
    public static void main(String[] args){
        int dayNum;
        do {

            dayNum = getInt("Enter weekday number please");
            switch (dayNum) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Средв");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Enter int from 1 to 7");
            }
        }
        while (dayNum <= 0 || dayNum >= 8);
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
