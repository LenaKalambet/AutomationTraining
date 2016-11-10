package lesson2;

/**
 * Created by admin on 30.09.2016.
 */
public class TypeConvertion1 {
    public static void main(String[] args){

        double b = 2.6;
        int c = (int)(0.5 +b);
        System.out.println(c);
        System.out.println((int)9.566);
        System.out.println((int)'A');
        System.out.println((double)3);

        Integer in = new Integer(100);
        Character ch = new Character('c');
        Boolean bo = new Boolean(true);

        int xlnt;
        Float x = new Float(3.89456123);
        xlnt = x.intValue();
        System.out.println(xlnt);
        //qweqwe git test
    }
}
