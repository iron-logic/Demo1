

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Calendar {
	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub



			//ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\vishali\\Documents\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.udemy.com/home/my-courses/learning/");
			//driver.navigate().back();
			//driver.navigate().forward();



			driver.get("https://beta.ocswholesale.ca/Admin/Signin");
			driver.findElement(By.name("Email")).sendKeys("vishali@ironlogic.ca");
			driver.findElement(By.id("password")).sendKeys("Trimd=2020");
			driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[19]/a")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[20]/a")).click();
		    Thread.sleep(3000);
		    JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,100)", "");
		    driver.findElement(By.xpath("//*[@id=\"filterDate\"]")).click();
		    
//		    Actions act=new Actions(driver);
//			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"filterDate\"]"))).click().build().perform();
			Thread.sleep(3000);
		    //driver.findElement(By.xpath("//input[@name='daterange']")).click();
		    //driver.findElement(By.id("filterDate")).click();
		    //driver.findElement(By.cssSelector("input.form-control")).click();
		    Thread.sleep(2000);
		    //driver.findElement(By.cssSelector(".today.active.start-date.available")).click();
		    
		    //driver.close();
		   
		 //test
		    
			
			
			
			
	}
}
