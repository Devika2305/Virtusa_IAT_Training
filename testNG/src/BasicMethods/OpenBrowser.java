package BasicMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public OpenBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32\\chromedriver.exe");

	}
	
	public WebDriver chooseBrowser(String browser,String url) throws InterruptedException {
		
		WebDriver driver = null;
		
		if(browser == "Chrome")
			driver = new ChromeDriver();
		
		else if(browser == "Firefox") {}
			
		else {}
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		return driver;

	}
}
