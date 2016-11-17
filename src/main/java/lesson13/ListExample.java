package lesson13;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by stas1 on 11.11.2016.
 */
public class ListExample {



    @Test
    public void testList(){
        List<String> linkedList = new LinkedList<>();

        List<String> arrayList = new ArrayList<>();

        arrayList.add(0,"Masha");
        arrayList.add(1,"Petya");
        arrayList.add(2,"Vasya");
        arrayList.add(3,"Olena");
        arrayList.add(4,"Danylo");

        List<String> collect = arrayList.stream().filter(s -> s.contains("o")).collect(Collectors.toList());

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }


        Iterator<String> collectIterator = collect.iterator();
        while(collectIterator.hasNext()){
            String text = collectIterator.next();
            System.out.println(text);
        }

        }


    @Test
    public void testSet(){
        Set<String> set = new HashSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        System.out.print(set); // [b,c,a]

        Set<String> set1 = new TreeSet<>();
        set1.add("a");
        set1.add("a");
        set1.add("c");
        System.out.print(set1); // [b,c,a]


        Set<String> set2 = new LinkedHashSet<>();
        set2.add("a");
        set2.add("c");
        set2.add("c");
        System.out.print(set2); // [b,c,a]

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }



    }
    @Test
    public  void mapTest(){


        Map<String,String> map = new HashMap<>();
        map.put("first","Mama");
        map.put("second", "Papa");
        map.put("Third","Child");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();

            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key+"  "+value);
            /*rty*/
        }


        }
    }





