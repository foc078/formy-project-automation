// WJ: The following packages are imported to use Selenium functionality:
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class TestSample  {
    public static void main(String[] args) {

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        // Create new instance of ChromeDriver (WJ: uses ChromeDriver package from line 2)
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google (WJ: uses WebDriver package from line 3)
        driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element =  // (WJ: uses WebElement package from line 4)
                driver.findElement(By.name("q"));  // (WJ: uses By package from line 5)

        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form
        element.submit();

        //Close the browser
        driver.quit();
    }
}


