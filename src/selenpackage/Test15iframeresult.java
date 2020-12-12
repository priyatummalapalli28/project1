package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15iframeresult
{

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");
		Thread.sleep(5000);
		//click on element
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
		Thread.sleep(5000);


	}

}
