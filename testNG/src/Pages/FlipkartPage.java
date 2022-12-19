package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartPage {

WebDriver driver;
	
	public FlipkartPage(WebDriver driver) {
		this.driver= driver;
	}
	
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
}
