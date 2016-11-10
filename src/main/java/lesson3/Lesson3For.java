package lesson3;

import com.beust.jcommander.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 03.10.2016.
 */
public class Lesson3For {
    public static void main(String[] args){
        // for
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }

        List<String> values = new ArrayList<String>();
        values.add("Petya");
        values.add("Masha");
       // for(int i: ArrayList){
//while
        int i = 1;
        while (i<5){
            System.out.printf(i+" ");
            i++;
        }
//do while
        i = 1;
        do{
            i++;
            System.out.println(i);
        }
        while (i<5);
        }
    }

