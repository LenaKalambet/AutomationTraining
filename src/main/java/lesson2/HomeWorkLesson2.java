package lesson2;

import org.apache.bcel.generic.GOTO;

import java.util.Scanner;

/**
 * Created by admin on 02.10.2016.
 */
public class HomeWorkLesson2 {

    public static void main (String[] args){

        boolean verify = false;
        System.out.println("1. Enter int value: ");
        Scanner scanner = new Scanner(System.in);
       do {
           verify = scanner.hasNextInt();
           if (verify) {
               int intInput = scanner.nextInt();
               char chOutput = (char) intInput;
               System.out.println("Int -> char " + chOutput);
           } else {
               System.out.println("Enter valid int value");
               scanner.next();
           }
       } while (verify == false);
        System.out.println("2. Enter float value: ");
        do {
            verify = scanner.hasNextFloat();
            if (verify) {
                float floatInput = scanner.nextFloat();
                char chOutput = (char) floatInput;
                System.out.println("Float -> char " + chOutput);
            } else {
                System.out.println("Please enter valid float with , delimiter");
                scanner.next();
            }
        } while (verify == false);
        System.out.println("3. Enter float value: ");
        do {
            verify = scanner.hasNextFloat();
            if (verify) {
                float floatInput = scanner.nextFloat();
                char chOutput = (char) floatInput;
                int intOut = (int) chOutput;
                System.out.println("Float -> char -> int: " + intOut);
            } else {
                System.out.println("Please enter valid float with , delimiter");
                scanner.next();
            }
        } while (verify == false);
    }
}
