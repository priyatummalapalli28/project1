package selenpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test7
{
	public static void main(String[] args) throws Exception
	
	{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Documents\\sel\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(10000);
		String x= driver.getTitle();
		System.out.println(x);
		driver.close();
	}
}
