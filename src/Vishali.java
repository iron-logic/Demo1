
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vishali {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishali\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		// driver.navigate().to("https://www.udemy.com/home/my-courses/learning/");
		// driver.navigate().back();
		// driver.navigate().forward();
		// Invite retailer OCS

		driver.get("https://beta.ocswholesale.ca/Admin/Signin");
		driver.findElement(By.name("Email")).sendKeys("vishali@ironlogic.ca");
		driver.findElement(By.id("password")).sendKeys("Trimd=2020");

		// Using tag name as xpath with array index
		driver.findElement(By.xpath("//div/h1")).getText();

		// driver.findElement(By.id("password")).sendKeys("Trimd=202023");

		// Retailer management
		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();

		// Invite retailer

		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[7]/a")).click();
		Thread.sleep(5000);

		// WebElement StaticDropdown =
		// driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[1]/div"));

		// Select dropdown = new Select(StaticDropdown);
		// dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[1]/span")).click();
		Thread.sleep(5000);

		WebElement StaticDropdown = driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[1]/span"));

		// Select dropdown = new Select(StaticDropdown);
		// dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[2]/div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CROLNumber")).sendKeys("1189");
		
		driver.findElement(By.id("Email")).sendKeys("IL10@mailinator.com");
		
		//Submit button
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		// driver.get("https://beta.ocswholesale.ca/Admin/CreatePassword?t=ac383c5d-e7a9-46ef-bef2-03400c9256d3");
		
		//Invitation sent link
		driver.findElement(By.xpath("//*[@id=\"modalSuccess\"]/div/div/div[2]/a")).click();

		driver.findElement(By.name("Email")).sendKeys("IL10@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("Rogers$1");
		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div[2]/div/div[3]/div/div[3]/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

		// Decalaration form
//		driver.findElement(By.id("accept")).click();
//		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.id("CROLCertificateName")).sendKeys("TOMM");

		WebElement StaticDropdown1 = driver.findElement(By.id("EntityTypeId"));
		Select dropdown = new Select(StaticDropdown1);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("RSANumber")).sendKeys("456789");
		driver.findElement(By.id("FirstName")).sendKeys("TOMM");
		driver.findElement(By.id("LastName")).sendKeys("SMITH");
		driver.findElement(By.id("PhoneNumber")).sendKeys("4599032145");
		driver.findElement(By.id("LegalAddress_Street")).sendKeys("10");
		driver.findElement(By.id("LegalAddress_Street2")).sendKeys("90");
		driver.findElement(By.id("LegalAddress_City")).sendKeys("ASDF");
		driver.findElement(By.id("LegalAddress_PostalCode")).sendKeys("V8t4M3");
		driver.findElement(By.id("StoreName")).sendKeys("YUIN");
		driver.findElement(By.id("StoreAddress_Street")).sendKeys("80");
		driver.findElement(By.id("StoreAddress_Street2")).sendKeys("32");
		driver.findElement(By.id("StoreAddress_City")).sendKeys("JKLM");
		driver.findElement(By.id("StoreAddress_PostalCode")).sendKeys("V8t4M3");
		Thread.sleep(2000);
		WebElement StaticDropdown2 = driver.findElement(By.id("IsFirstNation"));
		Select dropdown2 = new Select(StaticDropdown2);
		dropdown2.selectByIndex(0);
		// driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cROLInfoForm\"]/div[3]/a/span")).click();

		// After invitation sent password set process

		// driver.findElement(By.id("ContactNumber")).sendKeys("(1234567899");
		// driver.findElement(By.id("inputPassword")).sendKeys("Rogers$1");
		// driver.findElement(By.id("inputConfirmPassword")).sendKeys("Rogers$1");
		// driver.findElement(By.id("btnSubmit")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("accept")).click();
		// driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

		// driver.get("https://beta.ocswholesale.ca/Admin/CROLInfo");
		// driver.findElement(By.id("https://beta.ocswholesale.ca/Admin/CROLInfo")).sendKeys("ABCD");
		// Dropdown with select tag

		// WebElement StaticDropdown1 = driver.findElement(By.id("EntityTypeId"));
		// Select dropdown = new Select(StaticDropdown1);
		// dropdown.selectByIndex(1);
		// System.out.println(dropdown.getFirstSelectedOption().getText());
		// driver.findElement(By.id("RSANumber")).clear();
		// driver.findElement(By.id("RSANumber")).sendKeys("")

		// driver.get("https://www.mailinator.com");
		// Thread.sleep(2000);
		// driver.findElement(By.id("search")).sendKeys("IL9");
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div[1]/div/button")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"row_il9-1648568612-255831481\"]/td[2]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td/a")).click();

		// System.out.println(driver.findElement(By.id("errorMessage")).getText());
		// driver.findElement(By.linkText("Forgot Password?")).click();
		// driver.findElement(By.cssSelector("Input[name='Email']")).sendKeys("qwer");
		// System.out.println(driver.getCurrentUrl());
		// driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/div[2]/p"));
		// driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[@id=\\\"dropdownMenuButton\\\"]/div[2]/p\"));"));
		// driver.findElement(By.linkText("Learn More")).click();

	}
}
