
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Admin_Portal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishali\\Documents\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		

		driver.get("https://beta.ocswholesale.ca/Admin/Signin");
		driver.findElement(By.name("Email")).sendKeys("vishali@ironlogic.ca");
		driver.findElement(By.id("password")).sendKeys("Trimd=2020");

		// Using tag name as xpath with array index
		driver.findElement(By.xpath("//div/h1")).getText();

		
		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
		Thread.sleep(2000);
		//User management
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		//Users
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//New user
		

		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form[1]/div[1]/div[2]/div/span[1]/a/img")).click();
		
		WebElement StaticDropdown = driver.findElement(By.id("UserTypeId"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("FirstName")).sendKeys("Timmy");
		driver.findElement(By.id("LastName")).sendKeys("Cruze");

		driver.findElement(By.id("Email")).sendKeys("IL73@mailinator.com");
		driver.findElement(By.id("PhoneNumber")).sendKeys("8421098765");
		
		driver.findElement(By.xpath("//*[@id=\"vendorNumberList\"]/div[1]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"vendorNumberList\"]/div[1]/div[2]/div[2]/div")).click();
		driver.findElement(By.id("Title")).sendKeys("LP User");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[2]/div[2]/label[1]/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[3]/div[2]/div[1]/label/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[3]/div[2]/div[2]/label/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"deliveryInfoForm\"]/div/div/div/div[11]/div/button[2]")).click();
		
		
		
	}

}
