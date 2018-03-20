package sikuli;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular {

	
	public WebDriver invokeBrowser() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/DATA/chromedriver");
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		
		 return driver;
		
	}
	
public void login(WebDriver driver) throws InterruptedException{
		
	String url = "http://192.168.100.201:8081";
	driver.manage().deleteAllCookies();
	String username = "CTS201050";
	String password = "monirul1.2";
	
	driver.get(url);
	
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.className("btn-primary")).click();
	
	Thread.sleep(2000);
		
		
	}
	
public boolean tcode(WebDriver driver, String tcode) throws InterruptedException {
	driver.findElement(By.id("tcode")).sendKeys(tcode);
	driver.findElement(By.id("tcode")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	return true;
}
	
	public static void main(String[] args) throws IOException, SQLException, InterruptedException {
		// TODO Auto-generated method stub

	}

}
