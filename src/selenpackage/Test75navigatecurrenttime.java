package selenpackage;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test75navigatecurrenttime {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		long st2=System.currentTimeMillis();
		driver.navigate().to("http://www.magnitia.com");
		long et2=System.currentTimeMillis();
		System.out.println("Duration is"+(et2-st2));
		
		
	}

}
