import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basics {
	static WebDriver driver;
	 
@BeforeTest
	public static void ipace_Launch() throws InterruptedException, FileNotFoundException {
	
		 driver = null;
		WebDriverManager.chromedriver().browserVersion("83.0.4103.39").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); 
		options.addArguments("enable-automation"); 
		options.addArguments("--no-sandbox"); 
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation"); 
		options.addArguments("--disable-gpu"); 
		driver = new ChromeDriver(options); 
		driver.get("https://hrmslive.webdunia.net/Login"); 
		System.out.println("i Pace Opened Successfully");
	Thread.sleep(5000);
	
}
	@Test
	public void Loin() throws InterruptedException, FileNotFoundException {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	WebElement username =driver.findElement(By.xpath("//input[@class='form-control'][1]"));
	username.sendKeys("ramalinga.reddy@webdunia.net");
	driver.findElement(By.xpath("//input[@name='Password' ]")).sendKeys("ram@54321");
	driver.findElement(By.xpath("//input[@class='goBtn']")).click();
	Actions action = new Actions(driver);
	WebElement Hover=driver.findElement(By.xpath("//div[@class='menuIcon sidebar-toggler hidden-phone']"));
	action.moveToElement(Hover).click().perform();
	driver.findElement(By.id("Menu_151")).click(); // Clicking PMS 
	driver.findElement(By.xpath("//a[@href='/TimeSheet/TimeSheet']")).click();  //clicking on Timesheet
	driver.findElement(By.xpath("//*[@id=\"RFcollapse_1\"]/a")).click(); 
	driver.findElement(By.xpath("//*[@id=\"text\"]/span")).click();
	driver.findElement(By.id("txtPopupMonday")).sendKeys("8");
	driver.findElement(By.id("txtPopupMondayComments")).sendKeys("Test Execution and HO Tasks");
	driver.findElement(By.id("txtPopupTuesday")).sendKeys("8");
	driver.findElement(By.id("txtPopupTuesdayComments")).sendKeys("Test Execution and HO Tasks");
	driver.findElement(By.id("txtPopupWednesday")).sendKeys("8");
	driver.findElement(By.id("txtPopupWednesdayComments")).sendKeys("Test Execution and HO Tasks");
	driver.findElement(By.id("txtPopupThursday")).sendKeys("8");
	driver.findElement(By.id("txtPopupThursdayComments")).sendKeys("Test Execution and HO Tasks");
	driver.findElement(By.id("txtPopupFriday")).sendKeys("8");
	driver.findElement(By.id("txtPopupFridayComments")).sendKeys("Test Execution and HO Tasks");
	driver.findElement(By.id("Update")).click();;
	System.out.println("Success");
	}
	
	
	}
	


