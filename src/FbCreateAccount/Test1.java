package FbCreateAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        WebElement firstName = driver.findElement(By.xpath("//input[(@name='firstname')]"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        WebElement passWord = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select dropdown = new Select(day);
        dropdown.selectByValue("21");
        WebElement month = driver.findElement(By.cssSelector("#month"));
        Select dropMonth = new Select(month);
        dropMonth.selectByValue("3");
        WebElement year = driver.findElement(By.cssSelector("#year"));
        Select dropYear = new Select(year);
        dropYear.selectByValue("1998");

        sendKeys(driver,firstName, 10, "Mr");
        sendKeys(driver, lastName,20,"Alen");
        sendKeys(driver, email, 10,"mytest@gmail.com");
        sendKeys(driver, reEmail, 15,"mytest@gmail.com");
        sendKeys(driver, passWord,10, "1023598alex");
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(3000);
        submit.click();


    }


    public static void sendKeys(WebDriver driver1, WebElement element, double timeout, String value) {
        new WebDriverWait(driver1, Duration.ofSeconds((long) timeout))
                .until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }

}