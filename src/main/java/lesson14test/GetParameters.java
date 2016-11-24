package lesson14test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by stas1 on 24.11.2016.
 */
public class GetParameters {
    @Test
    @Parameters("xpath")
    public void getElement(String xpath){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        boolean q = driver.findElement(By.xpath(xpath)).isDisplayed();
        System.out.println(q);
        driver.quit();
    }
}
