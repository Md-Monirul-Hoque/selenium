import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/DATA/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/DATA/geckodriver");
//		System.setProperty("webdriver.opera.driver", "/DATA/operadriver");
		
	   WebDriver driver = new ChromeDriver();
//	   WebDriver driver = new FirefoxDriver();
//	   WebDriver driver = new OperaDriver();
	   driver.manage().window().maximize();
	   
/*	   driver.get("http://192.168.100.201:8081");
	   

	   
	  
	   String window1=driver.getWindowHandle();
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String x:windows){
			
			if(!(x.equals(window1)))
					{
				driver.switchTo().window(x);
				break;
				
					}
			
		}
			
		

		Actions action=new Actions(driver);
		String url="https://jqueryui.com/droppable/";
		driver.navigate().to(url);
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Thread.sleep(1000);
		action.dragAndDrop(drag, drop).perform();
		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	   
	   
	   
	   Thread.sleep(3000);
	   
	   
	   driver.switchTo().defaultContent();
	   
	   
	   driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[5]/a")).click();
	   
	   
	   Thread.sleep(3000);
	   
	   
	   WebElement item1=driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
	   WebElement item2=driver.findElement(By.xpath("//*[@id='sortable']/li[4]"));
	   
	   Thread.sleep(1000);
		action.dragAndDrop(item1, item2).perform();
		action.clickAndHold(item1).moveToElement(item2).release(item1).build().perform();
		
		Thread.sleep(3000);   */
		
		
	   driver.get("http://automationpractice.com/index.php");
	   
	   
	   Thread.sleep(3000);
		
	   
	   driver.quit();
		

	}

}
