package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test53switchtoframe 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("fname")).sendKeys("priya");
		driver.findElement(By.name("lname")).sendKeys("chinnu");
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		

	}

}
