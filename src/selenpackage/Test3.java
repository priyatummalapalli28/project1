package selenpackage;

import org.openqa.selenium.opera.OperaDriver;

public class Test3 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.opera.driver","D:\\operadriver_win64\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		driver.quit();
	}
}
