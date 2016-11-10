package lesson2;

/**
 * Created by admin on 30.09.2016.
 */
public class TypeConversion {
    public static void main(String[] args){
        int i = 12345679;
        long lo = i;
        short s = (short) lo;
        System.out.println(s);

        char ch = 'q';
        int intCH = (int) ch;

        System.out.println("char -> int " + intCH);
    }
}
