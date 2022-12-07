package SeleniumAssignment3;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleLinksAssignment3 {

	public void countLinks(WebDriver driver) {
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on a page :: "+count.size());
	}
	
	
	
	public void print(WebDriver driver) {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link:links){
			System.out.println(link);
			System.out.println("Link Text :: "+ link.getText());
			System.out.println("Link URL  :: "+ link.getAttribute("href"));			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		multipleLinksAssignment3 obj = new multipleLinksAssignment3();
		obj.countLinks(driver);
		obj.print(driver);
		Thread.sleep(3000);
		
	
	}
}
