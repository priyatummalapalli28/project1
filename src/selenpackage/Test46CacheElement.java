package selenpackage;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test46CacheElement 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String word=sc.nextLine();
		sc.close();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(word);
		//it can raise cache element with auto suggestions as a given word
		Thread.sleep(5000);
		//locate cache / auto-complete element
		WebElement ce=driver.findElement(By.xpath("//ul[@role='listbox']"));
		//testcase=1 get count of suggestions of cache element
		List<WebElement> items=ce.findElements(By.xpath("child::li"));
		System.out.println("number of suggestions in cache is:"+items.size());
		//testcase-2 get all suggestions text and display
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
		//testcase-3 check each item text which consists of given word r not
		int flag=0;
		for(WebElement item:items)
		{
			String y=item.getText();
			if(!y.contains(word))
		{
			flag=1;
			break;
		}
		}
		if(flag==0)
		{
			System.out.println("cache exceptions test passed for"+word);
			
		}
		else
		{
			System.out.println("cache suggestions failed for"+word);
		}
		//close site
		driver.close();
				
		
	}

}
