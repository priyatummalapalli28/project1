package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36radiobutton {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		//collect all radio button 
		List<WebElement> l=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("count of radio-buttons is"+l.size());
		//files visible and hidden drop downs
		int nvrb=0;
		int nhrb=0;
		for(WebElement e:l)
		{
			if(e.isDisplayed())
			{
				nvrb++;
				if(nvrb==3)
				{
					e.click();
				}
				else
				{
					nhrb++;
				}
			}
		}	
			System.out.println("visible radio-buttons count is"+nvrb);
			System.out.println("hidden radio-buttons count is "+nhrb);
			//close site
			driver.close();
					
		}
	}


