import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/andrewburlakov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("2000 Crystal Springs Rd San Bruno, California");
        Thread.sleep(1000);

        WebElement autocompleteSuggestion = driver.findElement(By.className("pac-item"));
        autocompleteSuggestion.click();



        driver.quit();
    }
}
