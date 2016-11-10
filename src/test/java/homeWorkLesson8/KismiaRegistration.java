package homeWorkLesson8;

import homeWorkLesson5.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 27.10.2016.
 */
public class KismiaRegistration {
    WebDriver driver;
    @DataProvider
    public Object[][] emails(){
        return new Object[][]{

               // {""},
                {"1233"},
                {"qwe"},
                {"!@#"},
                {"@."},
                {"qweqwe@qwe"},
                //{""},
        };
    }

    @BeforeTest
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "emails")
    public void testKismia(String email) throws InterruptedException {
        driver.get("https://kismia.com/#registration");
        KismiaMethods Kissmia = new KismiaMethods();
        Kissmia.setDriver(driver);
        Thread.sleep(1000);
        //Kissmia.clickRegistration();
        Kissmia.firstRegistrationStep();
        Kissmia.enterEmail(email);
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='block-last']/div[3]/span[6]")).getText().equals("Неверный формат email"));



    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
