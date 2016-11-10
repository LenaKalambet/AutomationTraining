package lesson4;

/**
 * Created by admin on 07.10.2016.
 */
public class Bubles {
    public static void main(String[] args) {
        int m =0;
        int[] arr = new int[]{1,9,-1,10,-45};
        do {
            m=0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int k;
                    k = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = k;
                    m = m + 1;
                }
            }
        }
        while (m!=0);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        }
}


