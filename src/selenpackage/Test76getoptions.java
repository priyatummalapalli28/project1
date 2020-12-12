package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test76getoptions
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in");
		//close banner if exists
		try
		{
			driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		}
		catch(Exception ex)
		{
			
		}
		//locate drop down using select tag
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		//get all items and display
		List<WebElement> items=s.getOptions();
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		//close site
		driver.close();
		}

}
