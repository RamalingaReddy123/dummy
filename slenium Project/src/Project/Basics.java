package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Basics {
	
	public void m1() {
		System.out.println("This is m1 Method");
	}
	
	public void m2() {
		System.out.println("This is m2 Method");
	}
	
	public void m3() {
		System.out.println("This is m3 Method");
	}
	@Test
	public void LaunchChrome_Method2() {	
		//System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
		   // prints Java Runtime Version before property set
	      System.out.print("Previous : ");
	      System.out.println(System.getProperty("java.runtime.version" ));
	      System.setProperty("java.runtime.version", "Java Runtime 1.6.0");
	     
	      // prints Java Runtime Version after property set
	      System.out.print("New : ");
	      System.out.println(System.getProperty("java.runtime.version" ));
		
	}


}

