package lesson3;

/**
 * Created by admin on 03.10.2016.
 */
public class Conditions {
    public static void main(String[] args){
        //if; if-else
        int a=3,b = 2;
        boolean bo = true;
        if (bo){
            System.out.println(b);
        }


        // is a = b?
        System.out.println(a==b? "a and b are equal": "a and b are not equal");

        for (a = 1; a<=10;a++){

            if (a == 5){break;}
            System.out.println(a);
        }
        System.out.println("The End");


    }

}
