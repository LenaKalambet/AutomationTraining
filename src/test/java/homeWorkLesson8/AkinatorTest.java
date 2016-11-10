package homeWorkLesson8;

import lesson5.Constanse;
import lesson5.Kissmia;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 27.10.2016.
 */
public class AkinatorTest {
    WebDriver driver;
    String email = "Vika.smile1993@mail.ru";
    String pass = "";

    // @BeforeTest
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    //@Test
    //@Parameters({"email", "pass"})
    public void trySelenium() throws InterruptedException, IOException {
        driver.get("http://ru.akinator.com/");
        Assert.assertTrue(driver.getTitle().equals(AkinatorConstants.TITLE));
        //Assert.assertEquals(driver.getTitle(),Constanse.TITLE_KISSMIA);
        //driver.quit();
        AkinatorMethods Akinator = new AkinatorMethods();
        Akinator.setDriver(driver);
        Akinator.clickPlay();
        Akinator.fillAge();
        Akinator.clickPlay2();
        while(Akinator.questionExist()){
            boolean verify;
            System.out.println(Akinator.showQuestion()+"\n");
            System.out.println("Да - 1");
            System.out.println("Нет - 2");
            System.out.println("Я не знаю - 3");
            System.out.println("Возможно частично - 4");
            System.out.println("Скорее нет Не совсем - 5");
            Akinator.doTurn();
            Thread.sleep(1000);
        }
        Akinator.showResult();


        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.urlContains("u17121788"));

    }

    //@AfterTest
    public void tearDown() {
        driver.quit();

    }
}
