package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test35dropdownspagesourcehidden 
{

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.mercurytravels.co.in");
		Thread.sleep(5000);
		//collect all dropdowns
		List<WebElement> l=driver.findElements(By.xpath("//select"));
		System.out.println("count of drop-downs is"+l.size());
		
		//filter visible and hidden drop downs
		int nvdd=0;
		int nhdd=0;
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				nvdd++;
			}
			else
			{
				nhdd++;
			}
		}
		
		System.out.println("visible drop downs count is"+nvdd);
		System.out.println("hidden drop downs count is"+nhdd);
		//close site
		driver.close();
	}
	

}
