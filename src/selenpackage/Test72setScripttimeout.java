package selenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test72setScripttimeout 
{
	public static void main(String[] args)throws Exception
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		driver.manage().timeouts().setScriptTimeout(1,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='200%';");
	}

}
