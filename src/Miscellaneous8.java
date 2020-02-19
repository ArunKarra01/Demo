import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers_Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("abc")).isSelected();
		driver.findElement(By.id("abc")).isDisplayed();
		driver.findElement(By.id("abc")).isEnabled();


	}

}
