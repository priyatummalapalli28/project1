package selenpackage;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test44mailattachemnts
{
	public static void main(String[] args)throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String bn=sc.nextLine();
		System.out.println("enter user id");
		String uid=sc.nextLine();
		System.out.println("enter password");
		String pwd=sc.nextLine();
		sc.close();
		//open required browser
		RemoteWebDriver driver;
		if(bn.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        driver=new ChromeDriver();
	    }
		else if(bn.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","firefoxdriver.exe");
	        driver=new FirefoxDriver();
	    }
		else
		{
			System.setProperty("webdriver.ie.driver","iedriverserver.exe");
	        driver=new InternetExplorerDriver();
		}
		
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//do login
		driver.findElement(By.name("identifier")).sendKeys(uid);//parameterization
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		int eam=0;
		int mwattch=0;
		while(2>1)//infinite loop
		{
			//locate current mailbox
			WebElement mailbox=driver.findElement(By.xpath("(//table)[7]/tbody"));
			List<WebElement> mails=mailbox.findElements(By.xpath("child::tr"));
			//List<WebElement> mails=driver.findElements(By.xpath("(//table)[7]/tbody/tr"));
			eam=eam+mails.size();
			for(WebElement mail:mails) 
			{
				try
				{
					WebElement e=mail.findElement(By.xpath("child::td[7]/img"));
					mwattch++;
					
				}
				catch(Exception ex)
				{
					continue;
				}
				
				///go to next page
				WebElement older=driver.findElement(By.xpath("//div[@aria-label='Older']"));
				try
				{
					if(older.getAttribute("aria-disabled=true").equals("true"))
					{
						break;
					}
				}
				catch(Exception ex)
				{
					older.click();
					Thread.sleep(5000);
				}
			}
			System.out.println("count mails in all mailbox pages is"+eam);
			System.out.println("count of mails with attachments is"+mwattch);
			//do logout
			driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/img")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Sign out")).click();
			Thread.sleep(5000);
			//close site
			driver.close();
			}
		}
			
	
		

	}


