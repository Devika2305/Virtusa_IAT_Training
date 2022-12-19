package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayPage {

	WebDriver driver;
	
	public EbayPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By clickEbay = By.xpath("//a[@href = \"https://www.ebay.com/\"]");
	By searchBox = By.xpath("//*[@id=\"gh-ac\"]");
	By searchBtn = By.id("gh-btn");
	int item;
	
	public void clickOnEbay() throws InterruptedException {
		driver.findElement(clickEbay).click();
		Thread.sleep(2000);
	}
	
	public void searchProduct(String product, String category) throws InterruptedException{
		
		driver.findElement(searchBox).sendKeys(product);	
		driver.findElement(searchBtn).click();
		Thread.sleep(2000);
	}
	public void searchNProduct(int item) {
		this.item = item;
		String productXpath = String.format("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li[%d]", item);;
		String nthProduct = driver.findElement(By.xpath(productXpath)).getText();
		System.out.println("Nth Product :: "+ nthProduct);
	}
	public void getAllProducts(){
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@id='ResultSetItems']/ul[@id='ListViewInner']/li"));
	
		for(WebElement product: allProduct){
			System.out.println(product.getText());
		
			System.out.println("-----------------------------------------");
		}
	}

}
