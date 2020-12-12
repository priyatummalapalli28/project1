package selenpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testsampledropdown

{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//locate drop down using select tag
		//WebElement e=driver.findElements(By.id("searchDropdownBox"));
		List<WebElement> items=driver.findElements(By.xpath("child::div[2]/div"));
		System.out.println("count of items in drop down is "+items.size());
		//get all items and display
		//List<WebElement> items=s.getOptions();
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
