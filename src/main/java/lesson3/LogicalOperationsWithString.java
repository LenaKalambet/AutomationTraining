package lesson3;

/**
 * Created by admin on 03.10.2016.
 */
public class LogicalOperationsWithString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String sameString = str1;

        //boolean b = str1==str2  - false as this is different objects
        boolean b = str1.equals(str2); //true
        boolean b1 = str1 == sameString; //true
    }
}
