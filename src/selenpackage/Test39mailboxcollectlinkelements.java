package selenpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test39mailboxcollectlinkelements

{

	public static void main(String[] args)throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("priyaselenium1");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Selenium1!");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(3000);
		//collect all elements in target page
		List<WebElement> l=driver.findElements(By.xpath("(//image)|(//link)|(//area)|(//a)|(//script)|(//base)|(//div)"));
//goto each one from 1st element (index=0) to last element (index=l.size()-1)
		int cwl=0;
		int bl=0;
		for(int i=0;i<l.size();i++)
		{
			try
			{
				WebElement e=l.get(i);
				//test case1:element have href attribute r not
				if(e.getAttribute("href")!=null)
				{
					String x=e.getAttribute("href");
					
				//test case2:href attribute is url r not	
					if(x.startsWith("https")||x.startsWith("http"))
					{
				//testcase3:url related server responding r not	
						
						URL u=new URL(x);
						HttpURLConnection con=(HttpURLConnection) u.openConnection();
						con.connect();
						String y=con.getResponseMessage();
						int z=con.getResponseCode();
						con.disconnect();
						if(z>=200 && z<=299)
						{
							cwl++;
						}
						else
						{
							bl++;
							System.out.println(x+"send"+y+"with"+z);
							
						}
						
					}
	
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
				if(ex.getMessage().contains("stale element reference"))
				{
					//recollect again to avoid stale exception
					l=driver.findElements(By.xpath("(//image)|(//link)|(//area)|(//a)|(//script)|(//base)|(//div)"));
					i--;
				}
			}
		}
		System.out.println("correctly working links count is"+cwl);
		System.out.println("broken links count is"+bl);
		//do logout
		driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//close site
		driver.close();
		}
	}
		
			
			

		
