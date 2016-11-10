package homeWorkLesson3;

import java.util.Scanner;

import static com.google.common.primitives.Ints.max;
import static com.google.common.primitives.Ints.min;


/**
 * Created by admin on 06.10.2016.
 */
public class Ex3
{
    public static void main(String[] args){

        int n =0, m =0;
        int i;
        for(i=1;i<=5;i++){

            String count;
            switch (i){
                case 1:
                    count = "first";
                    break;
                case 2:
                    count = "second";
                    break;
                case 3:
                    count = "third";
                    break;
                case 4:
                    count = "forth";
                    break;
                case 5:
                    count = "fifth";
                    break;
                default:
                    return;
            }


           int a = getInt("Enter "+count+" integer");
            if (i == 1){
                n = a;
                m = a;
            }
            else{
                if (a<=n){
                    n = a;
                }
                if (a>=m) {m = a;}
            }
        }
        System.out.println("min; "+n+"\nmax: "+m);
    }

/*    public static int[] getArray (String message){
        int[] array;
        int n=1;
        array = new int[n];
        boolean verify;
        Scanner scanner= new Scanner(System.in);
        for (n=1;n>0;n++) {

            if (verify = scanner.hasNext("exit")){
                n = -1;
            }else {

                if (verify = scanner.hasNextInt()) {
                    array[n] = scanner.nextInt();
                } else {
                    System.out.println(message);
                    scanner.next();
                }
            }
        }
return array;
    }*/

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
