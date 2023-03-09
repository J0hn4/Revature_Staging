import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class flipkartClicker {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

//        Thread.sleep(2000);

        WebElement exitModal = (new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(
                                "/html/body/div[2]/div/div/button")));

//        WebElement exitModal = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        exitModal.click();

        WebElement searchBar = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));

        searchBar.sendKeys("iPhone");

        WebElement searchSubmit = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"));

        searchSubmit.click();
//        searchSubmit.click();

        WebElement firstProduct = (new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(
                                "//div[contains(text(),'APPLE iPhone 13 (Starlight, 128 GB)')]")));

//        Thread.sleep(2000);
//        WebElement memoryInfo = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[3]/ul[1]/li[1]"));
//        String memoryText = memoryInfo.getText();

//        WebElement firstProduct = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Starlight, 128 GB)')]"));
        firstProduct.click();

//        Thread.sleep(2000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));


//        Thread.sleep(1000);

//        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable());

//        FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).pollingEvery(1000).withTimeout(2, TimeUnit.SECONDS);

        WebElement addCart = (new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(
                                "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")));

//        new FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(6000)).ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOf(ByXPath,"//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));

//        WebElement addCart = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
        addCart.click();

        WebElement cart = (new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(
                                "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a")));

        Thread.sleep(3000);



//        WebElement cart = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]/span[1]"));

        cart.click();

        WebElement placeOrder = (new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(
                                "//span[contains(text(),'Place Order')]")));



//        WebElement placeOrder = driver.findElement(By.xpath(""));

        placeOrder.click();

        WebElement login = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
        login.sendKeys("1234567890@gmail.com");


        WebElement continueButton = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]"));
        continueButton.click();

        WebElement loginPath = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));

//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");

        driver.switchTo().newWindow(WindowType.TAB);

//        # Open a new window
//        driver.execute_script("window.open('');");

//# Switch to the new window and open new URL
//        driver.switchTo().window(driver.getWindowHandle()[1]);
//        driver.get(new_url)



        driver.quit();

    }





}
