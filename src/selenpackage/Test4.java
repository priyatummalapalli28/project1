package selenpackage;

import org.openqa.selenium.edge.EdgeDriver;

public class Test4
{

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		EdgeDriver obj=new EdgeDriver();
		obj.get("https://www.amazon.com");
		Thread.sleep(5000);
		obj.quit();
		

	}

}
