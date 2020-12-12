package selenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test71pagetimeloadout {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
