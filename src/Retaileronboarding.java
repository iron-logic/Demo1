
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Retaileronboarding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vishali\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		// driver.navigate().to("https://www.udemy.com/home/my-courses/learning/");
		// driver.navigate().back();
		// driver.navigate().forward();

		// CROL information

		driver.get("https://beta.ocswholesale.ca/Admin/Signin");
		driver.findElement(By.name("Email")).sendKeys("IL9@mailinator.com");
		driver.findElement(By.id("password")).sendKeys("Rogers$1");
		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div[2]/div/div[3]/div/div[2]/div/div[2]/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();

		// Decalaration form
		// driver.findElement(By.id("accept")).click();
		// driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.id("CROLCertificateName")).sendKeys("Anna");

		// WebElement StaticDropdown1 = driver.findElement(By.id("EntityTypeId"));
		// Select dropdown = new Select(StaticDropdown1);
		// dropdown.selectByIndex(1);
		// Thread.sleep(2000);
		// driver.findElement(By.id("RSANumber")).sendKeys("6589021");
		// driver.findElement(By.id("FirstName")).sendKeys("Anna");
//		driver.findElement(By.id("LastName")).sendKeys("Laisy");
//		driver.findElement(By.id("PhoneNumber")).sendKeys("4589032145");
//		driver.findElement(By.id("LegalAddress_Street")).sendKeys("12");
//		driver.findElement(By.id("LegalAddress_Street2")).sendKeys("34");
//		driver.findElement(By.id("LegalAddress_City")).sendKeys("PLMN");
//		driver.findElement(By.id("LegalAddress_PostalCode")).sendKeys("V8t4M3");
//		driver.findElement(By.id("StoreName")).sendKeys("XYZ");
//		driver.findElement(By.id("StoreAddress_Street")).sendKeys("23");
//		driver.findElement(By.id("StoreAddress_Street2")).sendKeys("45");
//		driver.findElement(By.id("StoreAddress_City")).sendKeys("QWER");
//		driver.findElement(By.id("StoreAddress_PostalCode")).sendKeys("V8t4M3");
//		Thread.sleep(2000);
//		WebElement StaticDropdown2 = driver.findElement(By.id("IsFirstNation"));
//		Select dropdown2= new Select(StaticDropdown2);
//		dropdown2.selectByIndex(0);
//		//driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cROLInfoForm\"]/div[3]/a/span")).click();

		// Delivery information
		driver.findElement(By.id("PrimaryDeliveryContactFirstName")).sendKeys("Anna");
		driver.findElement(By.id("PrimaryDeliveryContactLastName")).sendKeys("Laisy");
		driver.findElement(By.id("PrimaryDeliveryContactNumber")).sendKeys("9532198765");
		driver.findElement(By.id("SecondaryDeliveryContactFirstName")).sendKeys("ANNY");
		driver.findElement(By.id("SecondaryDeliveryContactLastName")).sendKeys("Lisa");
		driver.findElement(By.id("SecondaryDeliveryContactNumber")).sendKeys("5432189076");
		Thread.sleep(2000);

		// Time slot1 opening
		WebElement StaticDropdown3 = driver.findElement(By.xpath("//*[@id=\"Opening\"]"));
		Select dropdown3 = new Select(StaticDropdown3);
		dropdown3.selectByIndex(1);

		Thread.sleep(2000);

		// Time slot1 closing

		Thread.sleep(2000);
		WebElement StaticDropdown4 = driver.findElement(By.xpath("//*[@id=\"Closing\"]"));
		Select dropdown4 = new Select(StaticDropdown4);
		dropdown4.selectByIndex(37);

		// Timeslot2 opening

		WebElement StaticDropdown5 = driver.findElement(By.cssSelector("select.ddlOpen_2"));
		Select dropdown5 = new Select(StaticDropdown5);
		dropdown5.selectByIndex(1);

		Thread.sleep(2000);

		//Closing
		WebElement StaticDropdown6 = driver.findElement(By.cssSelector("select.ddlClose_2"));
		Select dropdown6 = new Select(StaticDropdown6);
		dropdown6.selectByIndex(37);

		Thread.sleep(2000);

		// Timeslot3 opening

		WebElement StaticDropdown7 = driver.findElement(By.cssSelector("select.ddlOpen_3"));
		Select dropdown7 = new Select(StaticDropdown7);
		dropdown7.selectByIndex(1);

		Thread.sleep(2000);

		// Closing
		WebElement StaticDropdown8 = driver.findElement(By.cssSelector("select.ddlClose_3"));
		Select dropdown8 = new Select(StaticDropdown8);
		dropdown8.selectByIndex(37);

		Thread.sleep(2000);

		// Timeslot4 opening

		WebElement StaticDropdown9 = driver.findElement(By.cssSelector("select.ddlOpen_4"));
		Select dropdown9 = new Select(StaticDropdown9);
		dropdown9.selectByIndex(1);

		Thread.sleep(2000);

		// Closing
		WebElement StaticDropdown10 = driver.findElement(By.cssSelector("select.ddlClose_4"));
		Select dropdown10 = new Select(StaticDropdown10);
		dropdown10.selectByIndex(37);

		Thread.sleep(2000);

		// Timeslot5 opening

		WebElement StaticDropdown11 = driver.findElement(By.cssSelector("select.ddlOpen_5"));
		Select dropdown11 = new Select(StaticDropdown11);
		dropdown11.selectByIndex(1);

		Thread.sleep(2000);

		// Closing
		WebElement StaticDropdown12 = driver.findElement(By.cssSelector("select.ddlClose_5"));
		Select dropdown12 = new Select(StaticDropdown12);
		dropdown12.selectByIndex(37);

		Thread.sleep(2000);

		// Timeslot6 opening

		WebElement StaticDropdown13 = driver.findElement(By.cssSelector("select.ddlOpen_6"));
		Select dropdown13 = new Select(StaticDropdown13);
		dropdown13.selectByIndex(1);

		Thread.sleep(2000);

		// Closing
		WebElement StaticDropdown14 = driver.findElement(By.cssSelector("select.ddlClose_6"));
		Select dropdown14 = new Select(StaticDropdown14);
		dropdown14.selectByIndex(37);

		Thread.sleep(2000);

		// Timeslot7 opening

		WebElement StaticDropdown15 = driver.findElement(By.cssSelector("select.ddlOpen_7"));
		Select dropdown15 = new Select(StaticDropdown15);
		dropdown15.selectByIndex(1);

		Thread.sleep(2000);

		// Closing
		WebElement StaticDropdown16 = driver.findElement(By.cssSelector("select.ddlClose_7"));
		Select dropdown16 = new Select(StaticDropdown16);
		dropdown16.selectByIndex(37);

		Thread.sleep(2000);

		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"deliveryInfoForm\"]/div[3]/a[2]/span")).click();
	}
}
