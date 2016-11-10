package lesson9.package1.packageExtends;

import org.testng.annotations.Test;

/**
 * Created by admin on 28.10.2016.
 */
public class TestExtendExample {
    @Test
    public void tryIt() {
        Parent parent = new Parent("Kokoko", "01.10.1990");
        Child child = new Child("Kokoko", "01.10.2015");

        parent.makeSomeNoise();
        System.out.println("________________");
        child.makeSomeNoise();
    }


    @Test
    public void TryParent(){
        Parent child = new Child("qq","WW");

        child.makeSomeNoise();


    }

}
