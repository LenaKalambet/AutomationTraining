package homeWorkLesson4;

import java.util.Scanner;

import static com.google.common.primitives.Ints.max;
import static com.google.common.primitives.Ints.min;

/**
 * Created by admin on 09.10.2016.
 */
public class Ex4_5 {
    public static void main(String[] args) {
        int length = getInt("Enter array length");
        int[] array = getIntArr ("Enter array element: ", length);
        int max = max(array);
        int min = min(array);
        double k = (double) sumArr(array)/array.length;
        System.out.println("AVG of the array is: "+k);

        for (int i =0; i<array.length;i++){
            if(array[i] == max){
                array[i]=min;
            } else {
                if (array[i] == min) {
                    array[i] = max;
                }
            }
        }

        System.out.println("Result array: ");
        for (int arrElement: array){
            System.out.println(arrElement);
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

    public static int sumArr(int[] array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum;
    }
}
