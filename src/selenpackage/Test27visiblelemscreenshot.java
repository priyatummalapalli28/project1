package selenpackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test27visiblelemscreenshot
{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		//get visible element screenshot as a file 
		File src=driver.findElement(By.xpath("//input[@value='Go']")).getScreenshotAs(OutputType.FILE);
		File dest=new File("elemscreenshot.png");
		FileHandler.copy(src,dest);
		driver.close();

	}

}
