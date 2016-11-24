package homeWorkLesson13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by stas1 on 17.11.2016.
 */
public class CatMap {
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<String> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> catMap = new HashMap<>();
        for (int i =0;i<10;i++){
            Cat newCat = new Cat("Mew"+i);
            catMap.put(newCat.name,newCat);
        }
        return catMap;
    }

    public static Set<String> convertMapToSet(Map<String, Cat> map) {
        return map.keySet();
    }

    public static void printCatSet(Set<String> set) {
        for (String qwe : set) {
            System.out.println(qwe);
            }
    }

    public static class Cat
    {
        public String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
