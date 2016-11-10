package lesson1;

import org.openqa.jetty.html.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 29.09.2016.
 */
public class VKPage extends Page{
    By phoneNumberLocator = By.xpath(".//*[@id='index_email']");
    By passwordLocator = By.xpath(".//*[@id='index_pass']");
    By loginButtonLocator = By.xpath(".//*[@id='index_login_button']");
    private final WebDriver driver;

    public VKPage(WebDriver driver) {
        this.driver = driver;
    }

    public VKPage typePhoneNumber(String username) {
        driver.findElement(phoneNumberLocator).sendKeys(username);
        return this;
    }
    public VKPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }
    public VKPage clickLogIn() {
        driver.findElement(loginButtonLocator).click();
        return this;
    }

    public VKPage getTitle() {
        String title = driver.getTitle();
        System.out.println(title);
        return this;
    }
}
