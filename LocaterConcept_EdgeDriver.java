package SeleniumHomework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocaterConcept_EdgeDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        Thread.sleep(4000);

        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("software_gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test678");

        Thread.sleep(2000);
        driver.findElement(By.className("button-1 login-button")).click();





    }

}
