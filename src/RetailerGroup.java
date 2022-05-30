
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RetailerGroup {

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
		//*[@id="account"]/div/div/div[7]/button

		// Retailer management
		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/div/div[1]/div/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("Name")).sendKeys("ABCDE");
		driver.findElement(By.id("Description")).sendKeys("QWERTY");
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"btnColorPicker\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divColorDrop\"]/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/div/div[2]/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"UserListRow\"]/div[1]/div/table/tbody/tr[1]/td[1]/div/label[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formRetailerGroup\"]/div[3]/div/button[2]")).click();
		

	}

}
