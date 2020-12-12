package selenpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48multidropdownselect
{

	public static void main(String[] args)throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		//locate <div> tag drop down and get it into visble area of desktop
		//via a neighbor element
		WebElement neighbor=driver.findElement(By.xpath("//h4[text()='Multiple Selection']"));
		driver.executeScript("arguments[0].scrollIntoView();",neighbor);
		WebElement dd=neighbor.findElement(By.xpath("following-sibling::div"));
		Thread.sleep(5000);
		//testcase-1 check for multi select or not
				if(dd.getAttribute("class").contains("multiple"))
				{
					System.out.println("Multiple-select drop down");
					//start testing
				//testcase-2 collect all items of it and display
					List<WebElement> items=dd.findElements(By.xpath("child::div[2]/div"));
					System.out.println("count of items in drop down is "+items.size());
					for(WebElement item:items)
					{
						//get hidden items text using Javascript
						String x=(String) driver.executeScript("return(arguments[0].textContent);",item);
						System.out.println(x);
						
					}
					//testcase3-slect each item test that selection ans deselect that item
					for(WebElement item:items)
					{
						try
						{
							//1.open drop down
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
								String actual=dd.findElement(By.xpath("child::a")).getText();
								//6.compare both remembered text and visible text of selected item
								if(expected.equals(actual))
								{
									System.out.println(expected+"item selection test passed");
									
								}
								else
								{
									System.out.println(expected+"item selection test failed");
								}
								
								//7.deselect that item
								dd.findElement(By.xpath("child::a/i")).click();
								Thread.sleep(5000);
							}
							else
							{
								String y=(String) driver.executeScript("return(arguments[0].textContent);",item);
								System.out.println(y+"item is hidden");
							}
								
							//8.close drop down
							dd.sendKeys(Keys.ESCAPE);
							Thread.sleep(1000);
						}
						
						catch(Exception ex1)
						{
							System.out.println(ex1.getMessage());
						}
					}
					
					//testcase4 select multiple items and test them
					//1.open drop down
					dd.click();
					Thread.sleep(2000);
					//2.looping on items
					int flag=0;
					for(int i=0;i<items.size();i++)
					{
						try
						{
							//3.remember text of item to be sleected
							String Expected=items.get(i).getText();
							//4 select that item
							items.get(i).click();
							Thread.sleep(5000);
							//5.get selected item text 
							String actual=dd.findElement(By.xpath("child::a["+(i+1)+"]")).getText();
							//6.compare remembered text and visible text of selected item
							
							if(!Expected.equals(actual))
							{
								flag=1;
							}
						}
						catch(Exception ex)
						{
							System.out.println(ex.getMessage());
						}
						
					}
					//check flag after selectiong all items
					if(flag==0)
						
					{
						System.out.println("multiple selection items is correct");
					}
					else
					{
						System.out.println("multiple selection items is not correct");
					}
					}//if ending related to multo drop down select
				else
				{
					System.out.println("single-select drop down");
				}
				//close site
				driver.close();
					
	}

}
