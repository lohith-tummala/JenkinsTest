import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        String s = args[0];


        System.setProperty("webdriver.chrome.driver","/Users/lohith.tummala/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement elem = driver.findElement(By.name("q"));
        elem.sendKeys(s);
        elem.sendKeys(Keys.RETURN);

    }
}
