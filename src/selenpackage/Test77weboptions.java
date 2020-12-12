package selenpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test77weboptions 
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
				WebElement e=driver.findElement(By.name("theme"));
				Select s=new Select(e);
				//get all items and display
				List<WebElement> items=s.getOptions();
				ArrayList<String> x=new ArrayList<String>();
				ArrayList<String> y=new ArrayList<String>();
				//skip default items index starting with 0
				for(int i=1;i<items.size();i++)
				{
					WebElement item=items.get(i);
					x.add(item.getText());
					y.add(item.getText());
					
				}
				Collections.sort(y);
				if(x.equals(y))
				{
					System.out.println("items are already in sorted order");
				}
				else
				{
					System.out.println("items are not in sorted order");
				}
				driver.close();
		
	}

}
