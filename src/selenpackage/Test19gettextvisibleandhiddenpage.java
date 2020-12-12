package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19gettextvisibleandhiddenpage 
{

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//locate element in pagesource
		WebElement e1=driver.findElement(By.xpath("(//div[@class='text'][1])"));
		//get text of that element whch is visible in page
		String x=e1.getText();
		System.out.println(x);
		//locate element in page source
		WebElement e2=driver.findElement(By.xpath("(//div[@class='text'])[1]/following::div[2]"));
		//get text of that element which is hidden in page
		String y=(String) driver.executeScript("return(arguments[0].textcontent);",e2);
		System.out.println(y);
		//close site
		driver.close();
		

	}

}
