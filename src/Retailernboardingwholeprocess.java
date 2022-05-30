
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Retailernboardingwholeprocess {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishali\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

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

		driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[1]/span")).click();
		Thread.sleep(5000);

		WebElement StaticDropdown = driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[1]/span"));

		driver.findElement(By.xpath("//*[@id=\"divCrol\"]/div/div/div[2]/div[3]/div[3]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("CROLNumber")).sendKeys("1189");

		driver.findElement(By.id("Email")).sendKeys("IL61@mailinator.com");

		// Submit button
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		// driver.get("https://beta.ocswholesale.ca/Admin/CreatePassword?t=ac383c5d-e7a9-46ef-bef2-03400c9256d3");

		// Invitation sent link
		driver.findElement(By.xpath("//*[@id=\"modalSuccess\"]/div/div/div[2]/a")).click();

		// After invitation sent password set process
		driver.findElement(By.id("FirstName")).sendKeys("ELLY");
		driver.findElement(By.id("LastName")).sendKeys("White");

		driver.findElement(By.id("ContactNumber")).sendKeys("(1234777899");
		driver.findElement(By.id("inputPassword")).sendKeys("Rogers$1");
		driver.findElement(By.id("inputConfirmPassword")).sendKeys("Rogers$1");
		driver.findElement(By.id("btnSubmit")).click();
		Thread.sleep(2000);

		// Declaration form
		driver.findElement(By.id("accept")).click();
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();

		// CROL information

		driver.findElement(By.id("CROLCertificateName")).sendKeys("Elly");

		WebElement StaticDropdown1 = driver.findElement(By.id("EntityTypeId"));
		Select dropdown = new Select(StaticDropdown1);
		dropdown.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.id("RSANumber")).sendKeys("1189021");
		driver.findElement(By.id("FirstName")).sendKeys("Elly");
		driver.findElement(By.id("LastName")).sendKeys("White");
		driver.findElement(By.id("PhoneNumber")).sendKeys("8589032145");
		driver.findElement(By.id("LegalAddress_Street")).sendKeys("122");
		driver.findElement(By.id("LegalAddress_Street2")).sendKeys("345");
		driver.findElement(By.id("LegalAddress_City")).sendKeys("PAJK");
		driver.findElement(By.id("LegalAddress_PostalCode")).sendKeys("V8t4M3");
		driver.findElement(By.id("StoreName")).sendKeys("IKL");
		driver.findElement(By.id("StoreAddress_Street")).sendKeys("232");
		driver.findElement(By.id("StoreAddress_Street2")).sendKeys("44");
		driver.findElement(By.id("StoreAddress_City")).sendKeys("VBNM");
		driver.findElement(By.id("StoreAddress_PostalCode")).sendKeys("V8t4M3");
		Thread.sleep(2000);
		WebElement StaticDropdown2 = driver.findElement(By.id("IsFirstNation"));
		Select dropdown2 = new Select(StaticDropdown2);
		dropdown2.selectByIndex(0);
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cROLInfoForm\"]/div[3]/a/span")).click();

		// Delivery information
		driver.findElement(By.id("PrimaryDeliveryContactFirstName")).sendKeys("Elly");
		driver.findElement(By.id("PrimaryDeliveryContactLastName")).sendKeys("White");
		driver.findElement(By.id("PrimaryDeliveryContactNumber")).sendKeys("9533198765");
		driver.findElement(By.id("SecondaryDeliveryContactFirstName")).sendKeys("Elly");
		driver.findElement(By.id("SecondaryDeliveryContactLastName")).sendKeys("Lisa");
		driver.findElement(By.id("SecondaryDeliveryContactNumber")).sendKeys("5400189076");
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

		// Closing
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
		Thread.sleep(2000);

		// Uploadfile1

		driver.findElement(By.id("btnupload_0")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Documents\\fileupload.exe");

		// Uploadfile2
		driver.findElement(By.id("btnupload_1")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Documents\\fileupload.exe");

		Thread.sleep(3000);

		// Uploadfile3

		// driver.findElement(By.id("btnupload_2")).
//						var element = driver.findElement(By.id("btnupload_2"));
//						new Actions(driver).moveToElement(element).perform();
//						driver.findElement(By.id("btnupload_2")).click();

//				WebDriverWait wait=new WebDriverWait(driver,20);
//				WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnupload_2")));
//				driver.findElement(By.xpath("//*[@id=\"btnupload_2\"]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

//				Actions act = new Actions(driver);
//				act.moveToElement(driver.findElement(By.xpath("//*[@id=\"btnupload_2\"]"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnupload_2\"]")).click();
		Thread.sleep(2000);

		Runtime.getRuntime().exec("C:\\Users\\vishali\\Documents\\fileupload.exe");
		Thread.sleep(2000);

		// Uploadfile4

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");

		driver.findElement(By.id("btnupload_3")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Documents\\fileupload.exe");
		Thread.sleep(2000);

//						// Uploadfile5
		//
		driver.findElement(By.id("btnupload_4")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Documents\\fileupload.exe");
		Thread.sleep(2000);
		//
//						// Uploadfile6
		//
		driver.findElement(By.id("btnupload_5")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Downloads\\fileupload1.exe");
		Thread.sleep(2000);

		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"uploadDocumentsForm\"]/div[3]/a[2]/span")).click();

	}
	//
}
