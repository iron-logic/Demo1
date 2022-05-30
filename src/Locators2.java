import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "rahul";
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\abc\\Downloads\\chromedriver.exe");
		//WebDriver driver =new FirefoxDriver();
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\abc\\Downloads\\chromedriver.exe");
		//WebDriver driver =new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
        String password = getPassword(driver);
        


		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("password");
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		
	   Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
       driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		

		

	}



   public static String getPassword(WebDriver driver) throws InterruptedException
   {
	   driver.get("https://rahulshettyacademy.com/locatorspractice/");  
	   
	   driver.findElement(By.linkText("Forgot your password?")).click();

	   Thread.sleep(1000);

	   driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	   String passwordText =driver.findElement(By.cssSelector("form p")).getText();
	   String[] passwordArray =passwordText.split("'");
	  // String[] passwordArray2 =passwordArray[1].split("'");
	   //passwordArray2[0]
	   String password = passwordArray[1].split("'")[0];
			   return password;
   }
   
}