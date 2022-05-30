
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRoles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishali\\Documents\\chromedriver.exe");

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
		// User management
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/div/div[1]/div/table/tbody/tr/td[2]/a/img")).click();
		driver.findElement(By.id("Name")).sendKeys("Hensyy");
		driver.findElement(By.id("btnColorPicker")).click();
		driver.findElement(By.xpath("//*[@id=\"divColorDrop\"]/a[3]")).click();
		driver.findElement(By.id("Description")).sendKeys("Creating new role");
		//Permissions
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[4]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[2]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[3]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[4]/label/span")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[5]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[6]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[7]/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"divPermission\"]/div/div/div[1]/div[8]/label/span")).click();
		
		//Users
//		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[9]/div/button[2]")).click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-350)", "");
//		
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[4]/div/div/ul/li[3]/a")).click();
		
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"UserListRow\"]/div[1]/div/table/tbody/tr[2]/td[1]/div/label/span")).click();
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[9]/div/button[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[4]/div/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		JavascriptExecutor js4= (JavascriptExecutor) driver;
		js4.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"UserListRow\"]/div[1]/div/table/tbody/tr[2]/td[1]/div/label/span")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div/div[9]/div/button[2]")).click();
	
	}

}
