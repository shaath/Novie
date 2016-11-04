package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {

	public static void main(String[] args)
	{
		String expval="google";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());
		
//		System.out.println(driver.getPageSource());
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}

	}

}
