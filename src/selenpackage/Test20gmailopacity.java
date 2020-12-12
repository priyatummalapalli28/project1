package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test20gmailopacity 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		//locate gmail link element
		WebElement e=driver.findElement(By.linkText("Gmail"));
		//before focusing on element
		String x1=e.getCssValue("text-decoration");
		String y1=e.getCssValue("opacity");
		System.out.println("before focus");
		System.out.println(x1+""+y1);
		//move focus too element
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(5000);
		//after focus too element
		String x2=e.getCssValue("text-decoration");
		String y2=e.getCssValue("opacity");
		System.out.println("before focus");
		System.out.println(x2+""+y2);
		//Test case-1
		if(x2.contains("underline"))
		{
			System.out.println("element text was underlined after getting focus");
		}
		else
		{
			System.out.println("element text was not underlined after getting focus");
		}
		
		//testcase-2
		float f=Float.parseFloat(y2);
		if(f<1)
		{
			System.out.println("element color was shaded afer getting focus");
		}
		else
		{
			System.out.println("element color was not shaded afer getting focus");
		}
	}

}
