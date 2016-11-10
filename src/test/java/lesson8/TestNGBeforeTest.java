package lesson8;

import lesson5.Constanse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 24.10.2016.
 */
public class TestNGBeforeTest {

    WebDriver driver;
    @BeforeMethod
    public void setUpBrowser(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void aTest() throws InterruptedException {
       driver.get("https://google.com");
    }

    @Test
    public void bTest() throws InterruptedException {
        driver.get("https://www.facebook.com");
    }
    @Test
    public void cTest() throws InterruptedException {
        driver.get("https://vk.com");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();

    }

}
