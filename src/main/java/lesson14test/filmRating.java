package lesson14test;

import lesson10.filmRating_Const;
import lesson5.Constanse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 03.11.2016.
 */
public class filmRating {
    public WebDriver driver;

    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }



    public String getFilmNameById (int ID){
        String filmName = driver.findElement(By.xpath(filmRating_Const.getFilmNameXpathByID(ID))).getText();
        return filmName;
    }

    public double getFilmRatingById(int ID){
        double rating;
        String rat;
        rat = driver.findElement(By.xpath(filmRating_Const.getFilmRatingXpathByID(ID))).getText();

        rating = Double.parseDouble(rat.replace(',','.'));
        return rating;
    }

    public void tearDown() {
        driver.quit();

    }
}
