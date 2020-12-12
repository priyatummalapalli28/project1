package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18cssvalueofelem {

	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//locate searchbox element
		WebElement e=driver.findElement(By.name("q"));
		//get html attribute value of an element
		String x=e.getAttribute("maxlength");
		System.out.println("maxlength value is" +x);
		//get css value of element

		String y=e.getCssValue("background-color");
		System.out.println("background-color is:"+y);
		//close site
		driver.close();

		
		

	}

}
