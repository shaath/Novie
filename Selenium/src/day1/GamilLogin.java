package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GamilLogin
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		//manage()
		driver.manage().window().maximize();
		//findElement()
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
//		driver.findElement(By.id("Email")).clear();
		
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#signIn")));
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
		
	}

}
