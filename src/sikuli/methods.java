package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/DATA/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1
		String title = driver.getTitle();
		System.out.println(title);
		
		//2
        /*String pageSource = driver.getPageSource();
		System.out.println(pageSource);  */
		
		//3
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String url2 = "https://yahoo.com" ;
		
		driver.navigate().to(url2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}
