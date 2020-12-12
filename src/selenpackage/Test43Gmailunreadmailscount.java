package selenpackage;

import java.sql.Driver;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test43Gmailunreadmailscount {

	public static void main(String[] args) throws Exception
	
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
		
		driver.findElement(By.name("identifier")).sendKeys(uid);
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		//Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(10000);
		//go into each mail to check mail is read r unread
		int eam=0;
		int eurm=0;
		int erm=0;
		while(2>1)
		{
			WebElement mailbox=driver.findElement(By.xpath(("//table)[7]/tbody")));
			List<WebElement> mails=mailbox.findElements(By.xpath("child::tr"));
			//List<WebElement> mails=driver.findElements(By.xpath("(//table)[7]/tbody/tr"));
			eam=eam+mails.size();
			for(WebElement mail:mails)

			{
				WebElement e= mail.findElement(By.xpath("child::td[4]/div[1]"));
				String msg=(String) driver.executeScript("return(arguments[0].textContent);",e);
			
				
			if(msg.startsWith("unread"))
			
			{
				eurm++;
			}
			else
			{
				erm++;
				
			}
			
		}// for loop completion
		//go to next page
		WebElement older=driver.findElement(By.xpath("//div[@aria-label='Older']"));
		try
		{				
			if(older.getAttribute("aria-disabled").equals("true"))
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
	
	System.out.println("count mails in all mailbox pages is "+eam);
	System.out.println("unread mail count is "+eurm);
	System.out.println("read mail count is "+erm);
	String txt1= driver.findElement(By.xpath("//*[@aria-label='Show more messages']/descendant::span[5]")).getText();
	int aam=Integer.parseInt(txt1);
			
	String txt2=driver.findElement(By.xpath("//*[@data-tooltip='Inbox']/descendant::div[4]")).getText();
	int aurm=Integer.parseInt(txt2);
	if(aam==eam && aurm==eurm)
	{
		System.out.println("mails count test passed");
		
	}
	else
	{
		System.out.println("mails count test failed");
	}
	//do logout
	driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Signout")).click();
	Thread.sleep(5000);
	//close site
	driver.close();
	
	}
}

	


