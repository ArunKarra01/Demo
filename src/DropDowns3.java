import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDowns3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers_Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait d = new WebDriverWait(driver,10);
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.id("idvalue")));
		
		driver.findElement(By.id("idvalue")).sendKeys(Keys.SHIFT);
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByVisibleText("Jun");
		WebElement ele1 = driver.findElement(By.id("year"));
		Select s1 = new Select(ele1);
		s1.selectByVisibleText("2004");
		s1.selectByVisibleText("2006");
		s1.selectByVisibleText("2009");
		s1.selectByVisibleText("2012");
		

	}

}
