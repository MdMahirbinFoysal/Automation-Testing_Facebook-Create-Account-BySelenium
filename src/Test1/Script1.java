package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Iphone 15 pro");
//        driver.findElement(By.cssSelector("#gh-btn")).click();
//        js.executeScript("window.scrollBy(0,400)");
//        driver.findElement(By.id("item4484165642")).click();
        driver.findElement(By.xpath("//textarea[@role='combobox']")).sendKeys("Iphone 15 pro");
    }
}
