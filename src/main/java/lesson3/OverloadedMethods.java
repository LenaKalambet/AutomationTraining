package lesson3;

/**
 * Created by admin on 03.10.2016.
 */
public class OverloadedMethods {
    public static void main(String[] args){
        double a=1.9,b=7.1;
        System.out.println(OverloadedMethods.sum(a,b));

    }
    public static int sum(int a,int b){
        int x = a+b;
        return x;
    }

    public static double sum(double a,double b){
        double x = a+b;
        return x;
    }


}
