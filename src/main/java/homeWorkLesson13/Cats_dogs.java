package homeWorkLesson13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/**
 * Created by stas1 on 17.11.2016.
 */
public class Cats_dogs {

    public static void main(String[] args) {

        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Pet> pets = join(cats, dogs);
        printPets(pets);
        System.out.println();
        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        cats.add(cat1);
        Cat cat2 = new Cat();
        cats.add(cat2);
        Cat cat3 = new Cat();
        cats.add(cat3);
        Cat cat4 = new Cat();
        cats.add(cat4);
        return cats;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        Dog dog1 = new Dog();
        dogs.add(dog1);
        Dog dog2 = new Dog();
        dogs.add(dog2);
        Dog dog3 = new Dog();
        dogs.add(dog3);
        return dogs;
    }

    public static Set<Pet> join(Set<Cat> cats, Set<Dog> dogs) {
       Set<Pet> pets = new HashSet<Pet>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }



    public static void removeCats(Set<Pet> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Pet> pets) {
        Iterator<Pet> iterator = pets.iterator();
        while(iterator.hasNext()){
            iterator.next().voice();
        }
    }

    public static class Cat implements Pet{
        public void voice(){
            System.out.println("Mew");
        }
    }

    public static class Dog implements Pet {
        public void voice(){
            System.out.println("Gav");
        }
    }

    interface Pet{
        public void voice();
    }
}


