package lesson4;


import java.sql.Array;
import java.util.*;

/**
 * Created by admin on 07.10.2016.
 */
public class ArraysSort {
    public static void main(String[] args) {
        int someArray[] = {1,5,7,5,-10};
        java.util.Arrays.sort(someArray);
        for (int arrElement:someArray) {
        System.out.println(arrElement);
        }
        }

    }

