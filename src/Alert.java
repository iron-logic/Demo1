
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






public class Alert {





	public static void main(String[]args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		    String text = "Vishali";



			//ChromeDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\abc\\Downloads\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.manage().window().maximize();
			
			//driver.navigate().to("https://www.udemy.com/home/my-courses/learning/");
			//driver.navigate().back();
			//driver.navigate().forward();


			Thread.sleep(2000);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.findElement(By.id("name")).sendKeys(text);
			driver.findElement(By.id("alertbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.findElement(By.id("confirmbtn")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			
	}
}