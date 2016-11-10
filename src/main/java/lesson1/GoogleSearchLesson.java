package lesson1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 26.09.2016.
 */
public class GoogleSearchLesson {
String mySearchWord = "Hello World!";
    @Test
    public void findSomeWordInGoogle(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.findElement (By.cssSelector("#gs_htif0")).clear();
        driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys(mySearchWord);
        driver.quit();
    }
}
