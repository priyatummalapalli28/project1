package selenpackage;

import java.util.List;
//import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41eachandtotalpagescount {

	public static void main(String[] args)throws Exception
	{
		// 		// get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word to search");
		String word=sc.nextLine();
		sc.close();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(word,Keys.ENTER);
		//pagination on results pages
		int pc=0;
		int trc=0;
		while(true)
		{
			pc++;
			System.out.println("page-"+pc);
			System.out.println("-----------");
			//collect all elements in current page
			List<WebElement> rl=driver.findElements(By.xpath("//div[@class='g']"));
			int prc=0;
			for(int i=0;i<rl.size();i++)
			{
				WebElement e=rl.get(i);
			{
				prc++;
			}
			
		}
			System.out.println("count of results in this page" +prc);
			trc=trc+prc;
			//go to next page
			try
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
			catch(Exception ex)
			{
				break;
			}
			
		}
		System.out.println("total results count is"+trc);
		//close site
		driver.close();
	}

}
