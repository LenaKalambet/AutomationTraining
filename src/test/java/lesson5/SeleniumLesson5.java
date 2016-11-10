package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 10.10.2016.
 */
public class SeleniumLesson5 {
    WebDriver driver;
    String email = "Vika.smile1993@mail.ru";
    String pass = "";
    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    @Parameters({"email","pass"})
    public void trySelenium(@Optional("Vika.smile1993@mail.ru") String email, @Optional("1234") String pass) throws InterruptedException {
        driver.get("https://kissmia.com");
        Assert.assertTrue(driver.getTitle().equals(Constanse.TITLE_KISSMIA));
        //Assert.assertEquals(driver.getTitle(),Constanse.TITLE_KISSMIA);
        //driver.quit();
        Kissmia mainPage = new Kissmia();
        mainPage.setDriver(driver);


        mainPage.login(email,pass);


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("u17121788"));

    }
    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}
