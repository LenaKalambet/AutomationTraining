package lesson2;

/**
 * Created by admin on 30.09.2016.
 */
public class JavaWrapperClass {
    public static void main(String[] args){

        String s = "5";
        int i =6;
        int parseInt = Integer.parseInt(s);
        int sum = parseInt + i;
        System.out.println(sum);

        String qwe = Integer.toString(i)+s;
        System.out.println(qwe);

    }


}
