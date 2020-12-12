package selenpackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();
		// obj.get("http://www.amazon.in");
		obj.get("http://google.com");
		Thread.sleep(5000);
		obj.close();
	}
}
