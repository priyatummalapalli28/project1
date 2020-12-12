package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test100 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[text()='For myself']")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("firstName")).sendKeys("priya");
		driver.findElement(By.name("lastName")).sendKeys("chinnu");
		driver.findElement(By.name("Username")).sendKeys("priyachinnu813");
		driver.findElement(By.name("Passwd")).sendKeys("priyanka1!");
		//Thread.sleep(10000);
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("priyanka1!");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("countryList")).click();
		//driver.findElement(By.xpath("//*[@id='countryList']/div/div[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[text()='United States '])[4]")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'United States ')])[last()]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("phoneNumberId")).sendKeys("612-751-4271");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='VfPpkd-RLmnJb']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
