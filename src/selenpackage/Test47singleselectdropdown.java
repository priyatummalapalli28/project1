package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test47singleselectdropdown 
{
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//locate <div> tag drop down and get it into visble area of desktop
		//via a neighbor element
		WebElement neighbor=driver.findElement(By.xpath("//h4[text()='Search Selection']"));
		driver.executeScript("arguments[0].scrollIntoView();",neighbor);
		WebElement dd=neighbor.findElement(By.xpath("following-sibling::div"));
		//testcase-1 check for single-select or not
		if(dd.getAttribute("class").contains("multiple"))
		{
			System.out.println("Multiple-select drop down");
			//stop testing
		}
		else
		{
			System.out.println("single-select drop down");
			//start testing
			//test case-2: collect all items in that single select drop down and display
			List<WebElement> items=dd.findElements(By.xpath("child::div[2]/div"));
			System.out.println("count of items in drop down is "+items.size());
			for(WebElement item:items)
			{
				//get hidden items text using Javascript
				String x=(String) driver.executeScript("return(arguments[0].textContent);",item);
				System.out.println(x);
				
			}
			
			//testcase:3 select each item and test that selection
			for(WebElement item:items)
			{
				try
				{
					//1.Open drop down to get visibility of items
					dd.click();
					Thread.sleep(2000);
					//2.check item for visibility
					if(item.isDisplayed())
					{
						//3.Remember text of that item to be selected
						String expected=item.getText();
						//4.select that item
						item.click();
						//5.get selected item text
						String actual=dd.findElement(By.xpath("child::div[1]")).getText();
						//6.compare both remembered text and visible text of selected item
						if(expected.equals(actual))
						{
							System.out.println(expected+"item selection test passed");
							
						}
						else
						{
							System.out.println(expected+"item selection test failed");
						}
						}
					else
					{
						String y=(String) driver.executeScript("return(arguments[0].textContent);",item);
						System.out.println(y+"item is hidden");
					}
						
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}
			
		
		
	  }
    }
	driver.close();	

  }
}
