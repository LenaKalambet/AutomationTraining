package homeWorkLesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 27.10.2016.
 */
public class KismiaMethods {
    private WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void clickRegistration(){
        driver.findElement(By.cssSelector("#form-registration"));
    }

    public void firstRegistrationStep(){
        driver.findElement(By.xpath(".//*[@id='block-first']/div[1]/div[1]/label")).click();
        driver.findElement(By.xpath(".//*[@id='user-reg-myname']")).sendKeys("qweqwe");
        driver.findElement(By.xpath(".//*[@id='block-first']/button")).click();
    }

    public void enterEmail(String email){
        driver.findElement(By.xpath(".//*[@id='user-reg-myemail']")).sendKeys(email);
        driver.findElement(By.xpath(".//*[@id='block-last']/button")).click();
    }
}
