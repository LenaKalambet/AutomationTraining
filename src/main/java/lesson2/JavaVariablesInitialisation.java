package lesson2;

/**
 * Created by admin on 30.09.2016.
 */
public class JavaVariablesInitialisation {
    public static void main(String[] args){
        byte b =1;
        int i =1;
        long l = 1;
        short s = 1;

        double d = 1.5555d;
        float f = 1.1235f;
        l=i=s=b;

        d=f;

        System.out.println("long" +l);
        System.out.println("int" +i);
        System.out.println("short" +s);
        System.out.println("byte" +b);
        System.out.println("double" +d);
        System.out.println("float" +f);


    }


}
