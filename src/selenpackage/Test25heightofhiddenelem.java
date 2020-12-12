package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25heightofhiddenelem {

	public static void main(String[] args)throws Exception
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//locate elements in page source
		WebElement e1=driver.findElement(By.name("identifier"));
		WebElement e2=driver.findElement(By.name("hiddenPassword"));
		//get location of visible element in page
		Dimension d1=e1.getSize();
		int w1=d1.getWidth();
		int h1=d1.getHeight();
		System.out.println("location is+"+w1+""+h1);
		//get location hidden element in page
		Dimension d2=e2.getSize();
		int w2=d2.getWidth();
		int h2=d2.getHeight();
		System.out.println("location is+"+w2+""+h2);
		//close site
		driver.close();
		
		
	}

}
