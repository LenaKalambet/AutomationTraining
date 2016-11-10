package lesson2;

/**
 * Created by admin on 30.09.2016.
 */
public class JavaVariable {
    public static void main(String[] args){
        int x, y;

        x=2;
        y=3;
        byte getByte, putByte;

        putByte =0;
        getByte = putByte;

        String myString = new String("X  =");
        String myString2 = "Y =";
        System.out.println(myString+x+"\n"+myString2+y);

    }

}


