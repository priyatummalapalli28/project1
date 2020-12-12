package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22isdisplayedisenabled 
  {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//locate element in page source
		WebElement e=driver.findElement(By.name("hiddenPassword"));
		//locate element in page
		if(e.isDisplayed())
		{
			if(e.isEnabled())
			{
				System.out.println("enabled");
			}
			else
			{
				System.out.println("disabled");
			}
		}
		else
		{
			System.out.println("hidden element");
		}
		
		//close site
		driver.close();

	}

}
