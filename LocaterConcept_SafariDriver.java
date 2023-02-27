package SeleniumHomework2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LocaterConcept_SafariDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Software_yahoo.com");
        driver.findElement(By.name("Password")).sendKeys("TEST324");
        driver.findElement(By.cssSelector("Button[class='button-1 login-button']"));


    }
}
