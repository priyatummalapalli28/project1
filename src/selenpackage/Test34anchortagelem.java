package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34anchortagelem{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println("count of <a> tag elementsis:"+l1.size());
		List<WebElement> l2=driver.findElements(By.xpath("//a"));
		System.out.println("count of <a> tag elementsis:"+l2.size());

	}

}

