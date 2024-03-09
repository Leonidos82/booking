package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");

        WebElement buttonElement = driver
                .findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        buttonElement.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Algo ocurrió");
        }

        // Ejecución de lo que estamos realizando, instrucciones, y etc

        //driver.close();
        driver.quit();

    }
}
