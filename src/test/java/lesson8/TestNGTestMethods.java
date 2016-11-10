package lesson8;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by admin on 24.10.2016.
 */
public class TestNGTestMethods {


    @Test(dependsOnMethods = "cTest", alwaysRun = true)
    public void aTest(){
        System.out.println("a Test");
    }
    @Test()
    public void bTest(){
        System.out.println("b Test");
    }
    @Test(dependsOnMethods = "bTest")
    public void cTest(){
        System.out.println("c Test");
        Assert.fail();
    }

    public void noTest(){


    }

}
