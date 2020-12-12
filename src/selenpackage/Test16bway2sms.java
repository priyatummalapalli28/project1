package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16bway2sms {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.way2sms.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("mobileNo")).sendKeys("9090909090",Keys.TAB,"kalam");
	}

}
