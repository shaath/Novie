package day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertEg 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		String s=driver.findElement(By.id("login")).getAttribute("onclick");
		System.out.println(s);
//		driver.findElement(By.id("login")).click();
		
//		Alert alt=driver.switchTo().alert();
//		
//		System.out.println(alt.getText());
//		Sleeper.sleepTightInSeconds(5);
//		alt.accept();
		
	}

}
