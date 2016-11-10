package homeWorkLesson4;

import java.util.Scanner;

import static com.google.common.primitives.Ints.max;
import static com.google.common.primitives.Ints.min;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex2_3 {
    public static void main(String[] args) {
        int length = getInt("What is the length?");
        int[] array = getIntArr("Please enter element of array: ", length);
        for (int i =0; i<array.length;i++) {
            if (array[i] == min(array)){
                System.out.println("Min element #" +(i+1)+"="+array[i]);
            }
        }
        for (int i =0; i<array.length;i++) {
            if (array[i] == max(array)){
                System.out.println("Max element #" +(i+1)+"="+array[i]);
            }
        }

    }

    public static int[] getIntArr(String message, int length) {
        int[] array = new int[length];
        Scanner scanner = new Scanner(System.in);
        boolean verify;
        for (int i = 0; i < length; i++) {
            System.out.println(message);
            do {
                verify = scanner.hasNextInt();
                if (verify) {
                    array[i] = scanner.nextInt();
                } else {
                    System.out.println(message);
                    scanner.next();
                }
            } while (!verify);
        }
        return array;
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
