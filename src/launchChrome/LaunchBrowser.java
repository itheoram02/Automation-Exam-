package launchChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		//set property 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Selenium\\test\\driver\\chromedriver.exe");
		//object creation 
		WebDriver driver=new ChromeDriver();//object variable
		// Go to website 
		driver.get("https://amazon.com/");
		//ask driver to maximize the windoow
		driver.manage().window().minimize();
		// close the window
		driver.close();
		//Thread.sleep(3000);
		driver.getPageSource();
		
		//object creation 
		//Abc obj=new Abc();
		
		
		
		
		
	}

}
