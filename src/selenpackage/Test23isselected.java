package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23isselected {

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		//locate element in page source
		WebElement e=driver.findElement(By.xpath("(//input[@value='RoundTrip'])[1]"));
		//locate element in page
		//element is visible in page r not
		if(e.isDisplayed())
			
		{
			System.out.println("visible in page");
			
			//element is active or not
			
			if(e.isEnabled())
				
			{
				System.out.println("element is enabled");
				
				//selected or not
				
				if(e.isSelected())
				{
					System.out.println("selected");
				}
				else
				{
					System.out.println("not selected");
				}
				
			    }
			else
			{
				System.out.println("element is disabled");
			}
		}
		else
		{
			System.out.println("hidden");
		}
		
		//close site
		driver.close();

	}

}
