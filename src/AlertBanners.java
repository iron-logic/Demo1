import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBanners {

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
		//driver.findElement(By.xpath("//div/h1")).getText();

		driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[19]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[20]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/div[1]/div[2]/div/span[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[1]/div/div/div/div/div/div/div[1]/div[1]/button")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\vishali\\Downloads\\fileupload1.exe");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnColorPicker\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"divColorDrop\"]/a[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BannerTitle")).sendKeys("Creating Alert");
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,350)", "");
	    
	  // driver.findElement(By.xpath("/html/body/p")).sendKeys("Welcome to Home Page");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[5]/div/div/div[1]/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[5]/div/div/div[2]/div[3]/div[17]/span/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[6]/div/div/div[1]/div")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[6]/div/div/div[2]/div[3]/div[4]/span/i")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"StartDateTime\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/div[2]/form/div[1]/div[2]/div/div[8]/label[1]/span")).click();
		
		

	}

}
