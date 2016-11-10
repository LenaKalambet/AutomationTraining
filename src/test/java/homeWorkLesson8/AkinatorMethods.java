package homeWorkLesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by admin on 27.10.2016.
 */
public class AkinatorMethods {
    private WebDriver driver;
    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

    public void clickPlay(){
        driver.findElement(By.xpath(".//*[@id='bulle-inner']/a")).click();
    }

    public void fillAge(){
        driver.findElement(By.xpath(".//*[@id='elokence_sitebundle_identification_age']")).sendKeys("22");
    }

    public void clickPlay2(){
        driver.findElement(By.xpath(".//*[@id='infos-area-footer']/input")).click();
    }

    public boolean questionExist(){
        boolean q = driver.findElement(By.xpath(".//*[@id='bulle-outer']")).isDisplayed();
        return q;
    }

    public static int getInt (String message) throws IOException {
        int q = 0;
        boolean verify;
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        do {
            verify = scanner.hasNextInt();
            if (verify) {
                q = scanner.nextInt();
            } else {
                System.out.println(message);
                scanner.next();
            }
        } while (verify == false);
        return q;
    }

    public void doTurn() throws IOException {
        int turnId;
        //turnId = getInt("Enter your answer number: ");
        do {
            turnId = getInt("Enter your answer number: ");
            switch (turnId) {
                case 1:
                    driver.findElement(By.xpath(".//*[@id='reponse1']")).click();
                    break;
                case 2:
                    driver.findElement(By.xpath(".//*[@id='reponse2']")).click();
                    break;
                case 3:
                    driver.findElement(By.xpath(".//*[@id='reponse3']")).click();
                    break;
                case 4:
                    driver.findElement(By.xpath(".//*[@id='reponse4']")).click();
                    break;
                case 5:
                    driver.findElement(By.xpath(".//*[@id='reponse5']")).click();
                    break;
            }
        }
        while(turnId<=0 && turnId>=6);
    }

    public String showQuestion(){
        String question = driver.findElement(By.xpath(".//*[@id='bulle-outer']")).getText();
        return question;
    }

    public void showResult(){
        System.out.println(driver.findElement(By.xpath(".//*[@id='infos-perso']")).getText());
    }


    }

