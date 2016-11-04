package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkseg1 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));

		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String lText=links.get(i).getText();
			System.out.println(lText);
			if (lText.equalsIgnoreCase("Rajinikant")) 
			{
				flag=true;
				break;
			}
		}
		
		if (flag==true) 
		{
			System.out.println("Rajinkanth Link Available");
		}
		else
		{
			System.out.println("Rajinkanth Link Not Available");
		}
	}

}
