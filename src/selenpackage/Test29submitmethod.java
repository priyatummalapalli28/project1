package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29submitmethod 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("fname")).sendKeys("priyaselenium1");
		driver.findElement(By.name("lname")).sendKeys("magnitia250");
		driver.findElement(By.xpath("//*[@type='submit']")).submit();
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		
	}

}
