package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 10.10.2016.
 */
public class Kissmia {
    private WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void typeEmail(String email){
        driver.findElement(By.xpath(".//*[@id='user-email']")).sendKeys(email);

    }

    public void typePass(String pass){
        driver.findElement(By.xpath(".//*[@id='user-password']")).sendKeys(pass);

    }

    public void click(){
        driver.findElement(By.cssSelector(".submit")).click();
    }

    public void login(String email, String pass){
        typeEmail(email);
        typePass(pass);
        click();
    }
}
