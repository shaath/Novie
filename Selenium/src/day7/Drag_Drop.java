package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).build().perform();
		
		
	}

}
