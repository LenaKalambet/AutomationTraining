package lesson4;

import static com.google.common.primitives.Ints.max;
import static com.google.common.primitives.Ints.min;

/**
 * Created by admin on 07.10.2016.
 */
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {2, 3, -4, 6, 6, 6, 7, 8, 9, 0, 1111};

        int k = min(arr);
        int m = max(arr);
        System.out.println("min: "+k+"\nmax: "+m);
    }
}


