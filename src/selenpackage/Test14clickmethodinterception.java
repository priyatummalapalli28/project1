package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14clickmethodinterception {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("hiddenPassword")).click();
	}

}
