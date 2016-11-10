package lesson9.package1.packageExtends;

/**
 * Created by admin on 28.10.2016.
 */
public class Parent {

    public Parent(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public String name = "Dovakin";
    public String birthDate = "10.02.1950";


    public void makeSomeNoise(){
        System.out.println("FUS-RO-DA");
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }





}
