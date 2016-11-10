package homeWorkLesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by admin on 19.10.2016.
 */
public class ProfilePage {
    private WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }
    public void clickShowAll(){
        driver.findElement(By.xpath(Constants.SHOW_ALL_INFO_XPATH)).click();
    }
    public void clickEdit(String Edit){
        driver.findElement(By.xpath(Edit)).click();
    }

    public void typeTextEditField(String textField, String text){
        driver.findElement(By.xpath(textField)).sendKeys(text);
    }
    public void clickCancelEdit(String cancelButton){
        driver.findElement(By.xpath(cancelButton)).click();
    }
    public void editInfoWithCancel(String cancelButton, String textField,String editLink) throws InterruptedException {
        clickEdit(editLink);
        Thread.sleep(200);
        typeTextEditField(textField,"qweqwe");
        Thread.sleep(200);
        clickCancelEdit(cancelButton);
        Thread.sleep(200);
    }

}
