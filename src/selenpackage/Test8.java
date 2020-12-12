package selenpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{
	public static void main(String[] args)throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Documents\\sel\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.sentia.com");
		Thread.sleep(4000);
		String t=obj.getCurrentUrl();
		if(t.startsWith("https"))
		{
			System.out.println("site is secured");
		}
		else
		{
			System.out.println("site is not secured");
		}
		obj.close();
	}
}
