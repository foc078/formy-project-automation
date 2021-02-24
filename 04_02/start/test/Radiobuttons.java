import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/W/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 =  driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        WebElement radioButton2 =  driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        WebElement radioButton3 =  driver.findElement(By.xpath("/html/body/div/div[2]/input"));
        radioButton3.click();

        // Test for checkboxes

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 =  driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        WebElement checkbox2 =  driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();

        WebElement checkbox3 =  driver.findElement(By.xpath("/html/body/div/div[3]/div/div/input"));
        checkbox3.click();

        driver.quit();
    }
}
