package lesson10;

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
    public WebDriver driver1;
    public void setUpBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void setUpBrowser1() {
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver1.manage().timeouts().pageLoadTimeout(Constanse.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver1.manage().window().maximize();
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

    public double getFilmRatingByNameKinopoisk(String filmName) throws InterruptedException {
        double kinopoiskRating;
        driver1.findElement(By.xpath(".//*[@id='search_input']")).clear();
        driver1.findElement(By.xpath(".//*[@id='search_input']")).sendKeys(filmName);
        driver1.findElement(By.xpath(".//*[@id='top_form']/input[3]")).click();
        Thread.sleep(500);
        kinopoiskRating = Double.parseDouble(driver1.findElement(By.xpath(".//*[@id='block_left_pad']/div/div[3]/div/div[1]/div")).getText().replace(',','.'));
        return kinopoiskRating;
    }






    public void tearDown() {
        driver.quit();

    }
}
