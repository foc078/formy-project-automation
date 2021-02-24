import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/W/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton =  driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();


        //WebElement buttonsOption =  driver.findElement(By.cssSelector("a#autocomplete + a.dropdown-item"));
        WebElement buttonsOption =  driver.findElement(By.cssSelector("div[class='dropdown-menu show'] a:nth-child(2)"));
        //WebElement buttonsOption =  driver.findElement(By.cssSelector("div[class='dropdown-menu show'] a.dropdown-item"));

        //WebElement buttonsOption =  driver.findElement(By.cssSelector("div[class='dropdown-menu show'] a.dropdown-item"));

        //By.cssSelector("#parent li:nth-child(2)"))

        buttonsOption.click();


        driver.quit();
    }
}
