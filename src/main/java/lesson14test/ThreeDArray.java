package lesson14test;

/**
 * Created by stas1 on 18.11.2016.
 */
public class ThreeDArray {


    public static void main(String[] args) {
        int array[][][] = new int [10][10][10];
        for (int i = 0; i<10;i++){
            for (int j = 0; j<10; j++){
                System.out.println();
                for (int k = 0; k<10;k++){
                    array [i][j][k] = i+j+k;
                    System.out.print(array[i][j][k]+" ");
                }
            }
        }
    }
}
