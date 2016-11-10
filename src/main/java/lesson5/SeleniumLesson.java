package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 10.10.2016.
 */
public class SeleniumLesson {
    WebDriver driver;
    @BeforeTest
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void trySelenium() throws InterruptedException {
        driver.get("https://kissmia.com");
        Assert.assertTrue(driver.getTitle().equals(Constanse.TITLE_KISSMIA));
        //Assert.assertEquals(driver.getTitle(),Constanse.TITLE_KISSMIA);
        //driver.quit();
    }
    @AfterTest
    public void tearDown(){
        driver.quit();

    }

}
