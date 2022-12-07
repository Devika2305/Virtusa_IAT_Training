
package SeleniumAssignment2;

//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_Google {
	
	public void verifyPage(WebDriver driver) throws InterruptedException{
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl == "http://www.facebook.com")
			System.out.println("Redirected to Facebook");
		else
			System.out.println("Not Redirected");
	}
	
	public void Fill(WebDriver driver) {
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement surname = driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		
		firstname.sendKeys("Bhoomi");
		surname.sendKeys("Tiwari");
		email.sendKeys("bhoomitiw8@gmail.com");
		password.sendKeys("123456");
		
		Select day = new Select(driver.findElement(By.id("day")));
		Select month = new Select(driver.findElement(By.id("month")));
		Select year = new Select(driver.findElement(By.id("year")));
		
		day.selectByVisibleText("8");
		month.selectByVisibleText("Dec");
		year.selectByVisibleText("2002");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
		driver.findElement(By.xpath("//button[text()='Create an account']")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.fb.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("Title is :"+driver.getTitle());
		boolean contains = driver.getTitle().contains("Facebook");
		if(contains) {
			System.out.println("User landed on Facebook Page");
		}
		else {
			System.out.println("something wrong");
		}
		
		Assignment2_Google obj = new Assignment2_Google();
		obj.verifyPage(driver);
		obj.Fill(driver);
		Thread.sleep(3000);
		
	
	}

}