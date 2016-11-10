package homeWorkLesson3;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex8 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];


        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                arr[i-1][j-1] = i*j;
                //System.out.println(i+"*"+j+"="+arr[i-1][j-1]);
            }
        }
        for (int j=1;j<=10;j++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(arr[j-1][i-1]+" ");
            }
            System.out.print("\n");
        }
    }
}
