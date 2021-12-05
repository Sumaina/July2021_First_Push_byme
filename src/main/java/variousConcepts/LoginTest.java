package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumai\\eclipse_Selenium\\1stSeleniumm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		 
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
		
		
		public static void LaunchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sumai\\eclipse_Selenium\\1stSeleniumm\\driver\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://techfios.com/billing/?ng=admin/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
		}
		public static void logintest() {
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
		}
		
		public static void tearDown() {
	}
}
	
	
	