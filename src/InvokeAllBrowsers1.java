import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeAllBrowsers1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers_Temp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");		
		driver.close();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers_Temp\\geckodriver.exe");
//		WebDriver driver1 = new FirefoxDriver();
//		driver1.get("https://www.facebook.com/");
//		String title1 = driver1.getTitle();
//		System.out.println(title1);
//		driver1.close();
		
		
//		System.setProperty("webdriver.ie.driver", "C:\\WebDrivers_Temp\\IEDriverServer.exe");
//		WebDriver driver2 = new InternetExplorerDriver();
//		driver2.get("https://www.facebook.com/");
//		String title2 = driver2.getTitle();
//		System.out.println(title2);
//		driver2.close();
		
//		System.setProperty("webdriver.edge.driver", "C:\\\\WebDrivers_Temp\\\\msedgedriver.exe");
//		WebDriver driver3 = new EdgeDriver();
//		driver3.get("https://www.facebook.com/");
//		String title3 = driver3.getTitle();
//		System.out.println(title3);
//		driver3.close();
	}

}
