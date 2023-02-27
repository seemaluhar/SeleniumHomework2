package SeleniumHomework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LocaterConcept_FirefoxDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.name("Email")).sendKeys("Software_yahooo.com");
        driver.findElement(By.id("Password")).sendKeys("TEST234");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();




    }
}
