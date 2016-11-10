package homeWorkLesson11;

import lesson5.Constanse;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by stas1 on 06.11.2016.
 */
public class Ex1 {

    WebDriver driver;


    public static void main(String[] args) {
        Ex1 googlePage = new Ex1();
        googlePage.setUpBrowser();
        googlePage.exceptionCatch();
        googlePage.tearDown();
    }

    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    public void exceptionCatch(){
        driver.get("https://www.google.ru/");
        try {
            driver.findElement(By.xpath(".//*[@id='gs_htif1']")).click();
        } catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("There is no such element");
        }

    }


    public void tearDown() {
        driver.quit();
    }
}
