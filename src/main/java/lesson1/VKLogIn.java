package lesson1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;



import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 28.09.2016.
 */
public class VKLogIn {
    String phoneNumber = "380502618430";
    String pass = "qweqwe123";
    String pass2 = "LenaLuxoft2";

    @Test
    public void VKLogIn() throws InterruptedException {
        final WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://vk.com/");
        boolean formExist = driver.findElement(By.xpath(".//*[@id='index_login']")).isDisplayed();
        System.out.println(formExist);
        driver.findElement(By.xpath(".//*[@id='index_email']")).clear();
        driver.findElement(By.xpath(".//*[@id='index_email']")).sendKeys(phoneNumber);
        driver.findElement(By.xpath(".//*[@id='index_pass']")).clear();
        driver.findElement(By.xpath(".//*[@id='index_pass']")).sendKeys(pass);
        driver.findElement(By.xpath(".//*[@id='index_login_button']")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

    @Test
    public void facebookLogIn() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://uk-ua.facebook.com/");
        boolean formExist = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div")).isEnabled();
        System.out.println(formExist);
        driver.findElement(By.xpath(".//*[@id='email']")).clear();
        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(phoneNumber);
        driver.findElement(By.xpath(".//*[@id='pass']")).clear();
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pass2);
        driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

@Test
    public  void authorisationVK  () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://vk.com/");
        VKPage vk = new VKPage(driver);
        vk.typePhoneNumber(phoneNumber);
        vk.typePassword(pass);
        vk.clickLogIn();
        Thread.sleep(3000);
        vk.getTitle();
    driver.quit();
    }


@Test
    public  void authorisationFacebook  () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://uk-ua.facebook.com/");
        FacebookPage fb = new FacebookPage(driver);
        fb.typePhoneNumber(phoneNumber);
        fb.typePassword(pass2);
        fb.clickLogIn();
        Thread.sleep(3000);
        fb.getTitle();
        driver.quit();
    }


}
