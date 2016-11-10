package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 29.09.2016.
 */
public class FacebookPage {
    By phoneNumberLocator = By.xpath(".//*[@id='email']");
    By passwordLocator = By.xpath(".//*[@id='pass']");
    By loginButtonLocator = By.xpath(".//*[@id='u_0_l']");
    private final WebDriver driver;

    public FacebookPage(WebDriver driver) {
        this.driver = driver;
    }

    public FacebookPage typePhoneNumber(String username) {
        driver.findElement(phoneNumberLocator).sendKeys(username);
        return this;
    }
    public FacebookPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }
    public FacebookPage clickLogIn() {
        driver.findElement(loginButtonLocator).click();
        return this;
    }

    public FacebookPage getTitle() {
        String title = driver.getTitle();
        System.out.println(title);
        return this;

    }
}
