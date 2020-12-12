package selenpackage;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test6 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter browser name");
		String bn= sc.nextLine();
		sc.close();
		RemoteWebDriver driver=null;
		if(bn.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();		
		}
		else if(bn.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(bn.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver","D:\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver();
		}
		else if(bn.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(bn.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","D:\\iedriverserver.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("please check the browser name");
			System.exit(0);
		}
		//common code
		driver.get("http://www.amazon.com");
		Thread.sleep(10000);
		driver.close();
	}
}
