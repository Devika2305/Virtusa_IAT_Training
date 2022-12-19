package testNG_Assignments;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasicMethods.GoogleSearch;
import BasicMethods.OpenBrowser;
import Pages.EbayPage;

public class Assignment_4 {

	//Ebay
	WebDriver driver;
	EbayPage eb;
	
	@BeforeTest
	public void beforeTest() throws Throwable {
		OpenBrowser browser = new OpenBrowser();
		String url = " https://in.ebay.com/";
		driver = browser.chooseBrowser("Chrome",url);
	}
	
	@Test(priority=0)
	public void googleSearch() throws InterruptedException {
		GoogleSearch gs = new GoogleSearch(driver);
		gs.googleSearch("Ebay");
	}
	
	@Test(priority=1)
	public void clickEbay() throws InterruptedException {
		eb = new EbayPage(driver);
		eb.clickOnEbay();
	}
	
	@Test(priority=2)
	public void searchProduct() {
		eb.searchNProduct(10);
	}
	
	@Test(priority=3)
	public void searchAll() {
		eb.getAllProducts();
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
