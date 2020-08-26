import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/andrewburlakov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
            newTabButton.click();

        //Here we assign original window
        String originalHandle = driver.getWindowHandle();

        //Iterate over our open tabs
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);

            //Thread.sleep(5000);
        }
        //going back to our first window
        driver.switchTo().window(originalHandle);

        //Thread.sleep(5000);

        driver.quit();
    }
}
