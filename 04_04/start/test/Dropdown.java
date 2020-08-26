import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/andrewburlakov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        Thread.sleep(3000);

        WebElement dragAndDrop = driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
        dragAndDrop.click();
        Thread.sleep(3000);



        driver.quit();
    }
}
