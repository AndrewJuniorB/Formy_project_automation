import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/andrewburlakov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("file-upload-field.png");
        Thread.sleep(5000);

        WebElement resetButton = driver.findElement(By.cssSelector(".btn.btn-warning.btn-reset"));
        resetButton.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
