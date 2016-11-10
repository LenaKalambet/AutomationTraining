package homeWorkLesson5;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 19.10.2016.
 */
public class KissmiaTest {
    WebDriver driver;
    @BeforeTest
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void editUserInfoTest() throws InterruptedException {
        driver.get("https://kissmia.com");
        //Assert.assertEquals(driver.getTitle(),Constanse.TITLE_KISSMIA);
        //driver.quit();
        LoginPage loginPage = new LoginPage();
        loginPage.setDriver(driver);
        loginPage.login(Constants.EMAIL_USER1, Constants.PASS_USER1);
        ProfilePage profilePage = new ProfilePage();
        profilePage.setDriver(driver);
        profilePage.clickShowAll();
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH1, Constants.TEXT_EDIT_FIELD_XPATH1, Constants.EDIT_LINK_XPATH1);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH2,Constants.TEXT_EDIT_FIELD_XPATH2, Constants.EDIT_LINK_XPATH2);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH3,Constants.TEXT_EDIT_FIELD_XPATH3,Constants.EDIT_LINK_XPATH3);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH4,Constants.TEXT_EDIT_FIELD_XPATH4,Constants.EDIT_LINK_XPATH4);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH5,Constants.TEXT_EDIT_FIELD_XPATH5,Constants.EDIT_LINK_XPATH5);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH6,Constants.TEXT_EDIT_FIELD_XPATH6,Constants.EDIT_LINK_XPATH6);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH7,Constants.TEXT_EDIT_FIELD_XPATH7,Constants.EDIT_LINK_XPATH7);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH8,Constants.TEXT_EDIT_FIELD_XPATH8,Constants.EDIT_LINK_XPATH8);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH9,Constants.TEXT_EDIT_FIELD_XPATH9,Constants.EDIT_LINK_XPATH9);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH10,Constants.TEXT_EDIT_FIELD_XPATH10,Constants.EDIT_LINK_XPATH10);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH11,Constants.TEXT_EDIT_FIELD_XPATH11,Constants.EDIT_LINK_XPATH11);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH12,Constants.TEXT_EDIT_FIELD_XPATH12,Constants.EDIT_LINK_XPATH12);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH13,Constants.TEXT_EDIT_FIELD_XPATH13,Constants.EDIT_LINK_XPATH13);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH14,Constants.TEXT_EDIT_FIELD_XPATH14,Constants.EDIT_LINK_XPATH14);
        profilePage.editInfoWithCancel(Constants.CANCEL_BUTTON_XPATH15,Constants.TEXT_EDIT_FIELD_XPATH15,Constants.EDIT_LINK_XPATH15);
    }

    @AfterTest
        public void tearDown(){
            driver.quit();
        }

}
