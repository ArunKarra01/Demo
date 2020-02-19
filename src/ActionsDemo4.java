import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers_Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		// to move over the given point
		// a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//To send capital letters
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Arun").build().perform();
	
		
		//to do double click
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Arun").doubleClick().build().perform();
		
		//to do right click --- contextclick()
//		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).contextClick().build().perform();
			
		
//		String s = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("id");
//		System.out.println(s);
		
//		String s = driver.findElement(By.id("twotabsearchtextbox")).getText();
//		System.out.println(s);
		

	}

}
