package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24locationelement {

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
		Point p1=e1.getLocation();
		int x1=p1.getX();
		int y1=p1.getY();
		System.out.println("location is"+x1+""+y1);
		//get location hidden element in page
		Point p2=e2.getLocation();
		int x2=p2.getX();
		int y2=p2.getY();
		System.out.println("location is"+x2+""+y2);
		//close site
		driver.close();
	}

}
