package lesson10;

/**
 * Created by admin on 31.10.2016.
 */
public class StringBuilderTest {
    public static void main(String[] args) {

        char[] charArrayToString = {'a', 'b', 'c', 'd'};

        StringBuilder builder = new StringBuilder();
        for (char value : charArrayToString){

            builder.append(value);
        }

        System.out.println(builder);


    }


}
