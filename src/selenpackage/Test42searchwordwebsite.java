package selenpackage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test42searchwordwebsite 
{

	public static void main(String[] args)throws Exception 
	{
		// get data from keyboard
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
		int flag=0;
		int tpc=0;
		while(2>1)
		{
			tpc++;
			String t=driver.getTitle();
			if(!t.contains(word))
			{
				flag=1;
				break;//terminate from loop when does not contains word
										
			}
			
			try
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(2000);
			}
			catch(Exception ex)
			{
				break;
			}
		}
			if(flag==0)
			{
				System.out.println("title of "+tpc+" results pages is correct");
			}
			else
			{
				System.out.println(tpc+"of the results page is incorrect");
			}
			//close site
			driver.close();
		}
		
	}


