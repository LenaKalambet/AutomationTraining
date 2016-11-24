package lesson14test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by stas1 on 24.11.2016.
 */
public class CheckElementPresent {

    @Test
    public void checkElementPresent(){
        WebDriver driver = new ChromeDriver();
        driver.get ("http://www.google.com/");
        try{
            driver.findElement(By.xpath(".//qwe")).isDisplayed();
        }
        catch (NoSuchElementException e){
           // e.printStackTrace();
            System.out.println("There is no such element");
        }
        driver.quit();


    }
}
