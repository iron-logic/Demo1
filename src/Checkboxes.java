
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Checkboxes {
	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub



			//ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.manage().window().maximize();
			//driver.navigate().to("https://www.udemy.com/home/my-courses/learning/");
			//driver.navigate().back();
			//driver.navigate().forward();



			driver.get("https://beta.ocswholesale.ca/Admin/Signin");
			driver.findElement(By.name("Email")).sendKeys("pranaweera@ironlogic.ca");
			driver.findElement(By.id("password")).sendKeys("Trimd=2020");
			driver.findElement(By.xpath("//*[@id=\"account\"]/div/div/div[7]/button")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[10]/a")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[11]/a")).click();
		    Thread.sleep(2000);
		    Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"task_filterbar\"]/div/ul/li[11]/a")).getText(), "All Products");
		    Thread.sleep(2000);
		    driver.findElement(By.id("searchProduct")).sendKeys("Hindu Kush");
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"main_listDiv_6\"]/div/div[6]/p/a/img")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"task_tabsbar\"]/div/form/div[1]/div[2]/div/ul/li[3]/a")).click();
		    Thread.sleep(5000);
		    Assert.assertFalse(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		    //System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		    Thread.sleep(2000);
		   //System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		    Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
		    
		    driver.close();
		   
		 
		    
			
			
			
			
	}
}
