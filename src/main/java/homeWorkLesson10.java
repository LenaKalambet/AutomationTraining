import com.gargoylesoftware.htmlunit.javascript.host.intl.DateTimeFormat;

import java.util.Date;

/**
 * Created by admin on 03.11.2016.
 */
public class homeWorkLesson10 {
    public static void main(String[] args) {
        stringTest();
        stringBuilderTest();
        stringBufferTest();

    }

    public static void stringTest (){
        long e = new Date().getTime();
        String output = "Some text";
        int count = 100000;
        for(int i = 0; i < count; i++)
            output = output + "Some text";

        e = new Date().getTime() - e;
        System.out.println("String speed: "+e);
    }

    public static void stringBuilderTest(){
        long e = new Date().getTime();
        StringBuilder output = new StringBuilder();
        int count = 100000;
        for(int i = 0; i < count; i++)
            output.append("Some text");
        e = new Date().getTime() - e;

        System.out.println("StringBuilder speed: "+e);

    }

    public static void stringBufferTest(){
        long e = new Date().getTime();
        StringBuffer output = new StringBuffer();
        int count = 100000;
        for(int i = 0; i < count; i++)
            output.append("Some text");
        e = new Date().getTime() - e;

        System.out.println("StringBuffer speed: "+e);
    }
}
