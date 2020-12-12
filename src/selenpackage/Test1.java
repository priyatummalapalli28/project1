package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1
{
	public static void main(String[] args) throws Exception
	{
	//comments
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Documents\\sel\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		//obj.get("http://www.amazon.in");
		obj.get("http://google.com");
		Thread.sleep(5000);
		obj.close();
	}
}
