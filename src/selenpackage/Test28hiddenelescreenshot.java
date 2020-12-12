package selenpackage;

import java.io.File;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test28hiddenelescreenshot
{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//get hidden screen shot as a file successfully as per source code
		File src=driver.findElement(By.name("hiddenPassword")).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\eclipsephotonselenium\\selenproject\\elemtscreenshot.png");
		FileHandler.copy(src,dest);
		driver.close();
	}

}
