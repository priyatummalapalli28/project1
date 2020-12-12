package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30Tagname {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		String pr=driver.findElement(By.name("q")).getTagName();
		System.out.println(pr);
		//close site
		driver.close(); 

	}

}
