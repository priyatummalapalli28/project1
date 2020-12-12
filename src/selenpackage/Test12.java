package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		//Thread.sleep(10000);
		driver.findElement(By.name("identifier")).sendKeys("priyaselenium1");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Selenium1!");
		driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("to")).sendKeys("anil.tadikonda@outlook.com");
		driver.findElement(By.name("subjectbox")).sendKeys("hi anil first automation program");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hi anil ths s my first automation program \n happy to see my program \n bye");;
		driver.findElement(By.xpath("(//div[starts-with(@aria-label,'Send')])[2]")).click();
	}

}
