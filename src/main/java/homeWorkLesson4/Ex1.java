package homeWorkLesson4;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int j=0;

        for (int i=0;j<10 ; i++){
            int m = i%2;
            if (m == 1){
                arr[i/2] = i;
                j=j+1;
            }
        }

        for(int arrElements:arr){
            System.out.print(arrElements+", ");
        }
    }
}
