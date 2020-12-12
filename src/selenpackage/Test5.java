package selenpackage;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class Test5
{

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.ie.driver","D:\\iedriverserver.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.close();

	}

}
