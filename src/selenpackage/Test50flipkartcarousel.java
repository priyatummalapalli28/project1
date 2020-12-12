package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50flipkartcarousel 
{

	public static void main(String[] args)throws Exception
	{
	
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://www.flipkart.com");
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			Thread.sleep(10000);
			WebElement slider = driver.findElement(By.xpath("(//*[contains(@style,'transform')])[1]"));
			String tn = slider.getTagName();
			System.out.println(tn);
			// check the tagname is div/ul
			int count = 0;
			List<WebElement> slides;
			Thread.sleep(10000);
			if (tn.equals("div")) {
			// every child <div>is a slide
			slides = slider.findElements(By.xpath("child::div"));
			for (WebElement slide : slides) {
			try {
			Thread.sleep(2000);
			if (slide.getAttribute("data-clone").equals("false"))

			{
			Thread.sleep(5000);
			count = count + 1;
			}
			} catch (Exception ex) {
			Thread.sleep(5000);
			count = count + 1;
			}
			}
			} else // developed <ul> or <
			{
			// each site is using <li>
			Thread.sleep(5000);
			slides = slider.findElements(By.xpath("child::li"));
			count = slides.size();

			}
			System.out.println("count of all carsouel sliders " + count);
			// Test case2: slider are 2d or 3d
			Thread.sleep(5000);
			String a = slider.getCssValue("transform");
			if (a.equals("none"))
			{
			a = slider.getCssValue("transform-style");
			}
			if (a.contains("3D"))
			{
			System.out.println("3D slider");
			}
			else
			{
			System.out.println("2D slider");
			}
			// Test case 3: slides are moving or not moving

			String b = slider.getCssValue("transform");
			if (b.equals("none"))
			{
			System.out.println("slides are not moving automatically");
			}
			else
			{
			System.out.println("slides are moving automatically");
			// Test case4:get directins of each slide
			System.out.println("transform property value is " + b.toString());
			String c = b.substring(7,b.length()-1);
			String[] p = c.split(",");
			p[4] = p[4].trim();
			p[5] = p[5].trim();
			float x = Float.parseFloat(p[4]);
			float y = Float.parseFloat(p[5]);
			if (x < 0 && y == 0)
			{
			System.out.println("slides are moving from right to left");
			}
			else if (x > 0 && y == 0)
			{
			System.out.println("slides are moving from left to right");
			}
			else
			if (x == 0 && y < 0)
			{
			System.out.println("slides are moving bottom to top");
			}
			else
			{
			System.out.println("slides are moving ftom top to bottom");
			}
			String d = slider.getCssValue("transform");
			System.out.println(d);
			String[] q = d.split(" ");
			if (q[2].equals("ease-in"))
			{
			System.out.println("slow start for each slides");
			}
			else
			if (q[2].equals("ease-out"))
			{
			System.out.println("slow end for each slide");
			}
			else
			{
			System.out.println("ease-in-out for each slides");
			}
			// Test case:6 duration of slides
			System.out.println("duration of each slide " + q[1]);
			q[3].replace(", ", "");
			System.out.println("delay in between slides is " + q[3]);
			}
			

			


	}

}
