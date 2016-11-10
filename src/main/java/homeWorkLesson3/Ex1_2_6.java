package homeWorkLesson3;

import java.util.Scanner;

import static com.google.common.primitives.Ints.max;
import static com.google.common.primitives.Ints.min;

/**
 * Created by admin on 06.10.2016.
 */
public class Ex1_2_6 {
    public static void main(String[] args){
        int l = 0;
        int sum =0;
        int[] arr = new int[4];
        for (int i=0; i<4; i++) {
            arr[i] = getInt("Value: ");
    }

    int k = min(arr[0],arr[1],arr[2],arr[3]);
    int m = max(arr[0],arr[1],arr[2],arr[3]);

       System.out.println("min "+k+"\nmax "+m);

        for (int i=0; i<4; i++){
            if (m == arr[i])
            {
                l = l + arr[i];
            }
            if (k != arr[i]){
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of elements with max value: "+l+"\nSum of elements without min: "+sum);
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
