package selenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26getrect
{

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(5000);
		//apply getRect() on an element at the top of the page
		WebElement e1= driver.findElement(By.xpath("//input[@value='Go']"));
		Rectangle r1=e1.getRect();
		int w1=r1.getWidth();
		int h1=r1.getHeight();
		int x1=r1.getX();
		int y1=r1.getY();
		System.out.println("size is"+w1+" "+h1);
		System.out.println("location is"+x1+" "+y1);
		//apply getRect() on an element at bottom of page
		Rectangle r2=driver.findElement(By.id("icp-touch-link-language")).getRect();
		int w2=r2.getWidth();
		int h2=r2.getHeight();
		int x2=r2.getX();
		int y2=r2.getY();
		System.out.println("size is"+w2+" "+h2);
		System.out.println("location is"+x2+" "+y2);
		//close site
		driver.close();
	}
}
		
		