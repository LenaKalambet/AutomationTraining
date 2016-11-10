package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 04.11.2016.
 */
public class ExceptionsExample {


    WebDriver driver ;
int result;

    @Test
    public void mathException(){
try {
    result = 5 / 0;
    driver.get("Jack");
} catch (ArithmeticException e){
    e.printStackTrace();
    System.out.println("Dividing by zero! ");
} catch (NullPointerException e){

    e.printStackTrace();
    System.out.println("Blank object! ");
} finally {
    System.out.println("Final Block!  ");
}
System.out.println(result);
    }
    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

@Test
    public void checkSearchResults() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement (By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("JACK SPARROW");
        driver.findElement(By.name("btnG")).click();
       List<WebElement> elements = driver.findElements(By.cssSelector(".srg .g"));
        int searchresultCount = elements.size();
        if (searchresultCount >8){
            throw new Exception("Jack is >8!   ");
        }

        System.out.println(searchresultCount);
    }

    @Test
    public void someMethod(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://kismia.com");
        driver.manage().window().maximize();
        try {
            driver.findElement(By.xpath(".alalal"));
        } catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Incorrect selector. ");
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
