package selenpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venkata\\Documents\\sel\\chromedriver.exe");
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.amazon.com");
		Thread.sleep(4000);
		String x=obj.getPageSource();
		String y=obj.getWindowHandle();
		System.out.println(x);
		//System.out.println(y);
		obj.close();
	}

}
