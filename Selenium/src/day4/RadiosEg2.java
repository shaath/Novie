package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiosEg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radios=block.findElements(By.tagName("input"));
		for (int i = 0; i < radios.size(); i++) 
		{
			String rText=radios.get(i).getAttribute("value");
			System.out.println(rText);
			
			if (rText.equalsIgnoreCase("cheese"))
			{
				radios.get(i).click();
				break;
			}
			
		}
		
	}

}
