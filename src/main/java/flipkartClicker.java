import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;


public class flipkartClicker {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(2000);

        WebElement exitModal = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        exitModal.click();

        WebElement searchBar = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]"));

        searchBar.sendKeys("iPhone");

        WebElement searchSubmit = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]"));

        searchSubmit.click();
//        searchSubmit.click();


        Thread.sleep(2000);
//        WebElement memoryInfo = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[3]/ul[1]/li[1]"));
//        String memoryText = memoryInfo.getText();

        WebElement firstProduct = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone 13 (Starlight, 128 GB)')]"));
        firstProduct.click();

        Thread.sleep(2000);

        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));

        WebElement addCart = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]"));
        addCart.click();

        Thread.sleep(2000);

        WebElement placeOrder = driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));


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
        driver.switchTo().window(driver.getWindowHandle()[1]);
//        driver.get(new_url)












//        driver.quit();

    }





}
