package selenpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test74getcurrentmillis {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		long st1=System.currentTimeMillis();
		driver.get("http://www.magnitia.com");
		long et1=System.currentTimeMillis();
		System.out.println("Duration is"+(et1-st1));
		

	}

}
