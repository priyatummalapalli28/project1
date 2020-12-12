package selenpackage;

import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test73navigate {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.magnitia.com");
		Thread.sleep(5000);
		//launch -2
		driver.navigate().to("http://www.gmail.com");//url as string
		Thread.sleep(5000);
		//launch-3
		URL u=new URL("http://www.google.co.in");
		driver.navigate().to(u);//url as an object
		Thread.sleep(5000);
		//back to site-2
		driver.navigate().back();
		Thread.sleep(5000);
		//go to to site-3
		driver.navigate().forward();
		Thread.sleep(5000);
		//reload site-3 page
		driver.navigate().refresh();
		
				
	}

}
