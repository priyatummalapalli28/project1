package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test32gmailallrows 
{

	public static void main(String[] args)throws Exception 
	{
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//do login
				driver.findElement(By.name("identifier")).sendKeys("priyaselenium1");//parameterization
				driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("password")).sendKeys("Selenium1!");
				driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
				Thread.sleep(5000);
				WebElement mailbox=driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
				List<WebElement> mails=mailbox.findElements(By.xpath("child::tr"));
				System.out.println("count of visible mails"+mails.size());
				//do logout
				driver.findElement(By.xpath("//*[starts-with(@aria-label,'Google Account')]/img")).click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Sign out")).click();
				Thread.sleep(5000);
				//close site
				driver.close();
				

	}

}
