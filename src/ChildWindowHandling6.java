import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers_Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
//		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
//		System.out.println(driver.getTitle());
//		driver.findElement(By.linkText("Click Here")).click();
//		System.out.println(driver.getTitle());
//		
//		Set<String> str = driver.getWindowHandles();
//		Iterator<String> it =str.iterator();
//		
//		String parentID = it.next();
//		String childID = it.next();
//		
//		driver.switchTo().window(childID);
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());

		
		
		// To open link in new tab
		driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
	}

}
