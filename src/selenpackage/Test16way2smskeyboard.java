package selenpackage;

// java.security.Key;

//import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.grpc.Context.Key;

public class Test16way2smskeyboard
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//launch site
		driver.get("https://www.way2sms.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("mobileNo")).sendKeys("9666122271",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
	}

}
