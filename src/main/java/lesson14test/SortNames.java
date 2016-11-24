package lesson14test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by stas1 on 18.11.2016.
 */
public class SortNames {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        sort(list); //метод для сортировки списка

        list.forEach(System.out::println);
        //вывести список в отсортированном порядке
    }

    public static void sort(List<String> list) {
        int m =0;
        do {
            m=0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (isGreaterThan(list.get(i),list.get(i+1))) {
                    String k;
                    k = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i + 1, k);
                    m = m + 1;
                }
            }
        }
        while (m!=0);
    }





    //реализуйте свой алгоритм сортировки списка при помощи  метода isGreaterThan(String a, String b)


    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}

