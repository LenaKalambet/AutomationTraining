package lesson9.package1.packageExtends;

/**
 * Created by admin on 28.10.2016.
 */
public class Child extends Parent {

    public Child(String name,String birthDate){
        super(name, birthDate);
    }

    public void cry(){
        name = "Sparrow";
        makeSomeNoise();
    }

    @Override // to override patent method by your own
    public void makeSomeNoise(){
        super.makeSomeNoise(); // use class from parent instead of your new overwriten one
        System.out.println("qwqweqwe");
    }

    public void myChildMethod(){
       System.out.println("YAAAAA-YAAAAA");

    }



}
