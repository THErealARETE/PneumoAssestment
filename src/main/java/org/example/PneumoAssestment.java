package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PneumoAssestment {

    public static void main(String[] args) {

        try{
            theFlow();
        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }
    }

    public static void theFlow() throws StaleElementReferenceException, InterruptedException {

        theLogin();
        theSignUp();
    }

    public static void theLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://chess.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"sb\"]/div[3]/a[9]")).click();
        driver.findElement(By.id("username")).sendKeys("pneumaoutsourcing");
        driver.findElement(By.id("password")).sendKeys("Pneuma@test123");
        driver.findElement(By.id("login")).click();
        Thread.sleep(6000);
        driver.quit();
    }

    public static void theSignUp()throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("https://chess.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("menu-cta")).click();

        driver.findElement(By.id("registration_username")).sendKeys("T2estNewUser88123Test");
        driver.findElement(By.id("registration_email")).sendKeys("T2estnewUser88@gmail.com");
        driver.findElement(By.id("registration_password")).sendKeys("T2estnewPassword123@88");

        driver.findElement(By.id("registration_submit")).click();

        Thread.sleep(6000);
        driver.quit();
    }

}
