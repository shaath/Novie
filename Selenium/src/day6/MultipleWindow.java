package day6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindow {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		while (it.hasNext()) 
		{
			String windowId=it.next();
			System.out.println(windowId);
			
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
			try
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle());
				break;
			} 
			catch (Exception e)
			{
				System.out.println("The Terms of Service link not available in "+driver.getTitle()+" Page");
			}
		}
		


	}

}
