package sikuli;


import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;



public class Sikuli1 {
	Regular c = new Regular();
	Screen screen = new Screen();

	public boolean sikulifileupload(WebDriver driver) throws InterruptedException, FindFailed {
		
  c.tcode(driver, "PRJ8");
  driver.findElement(By.xpath("//*[@id='container']/div/form[1]/div/div[1]/div[3]/div/div[1]/div[2]/span")).click();
  
  Pattern location = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/otherLocation.png");	
  Pattern computer = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/computer.png");
  Pattern data = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/data.png");
  Pattern file = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/projectxlsx.png");
  Pattern open = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/open.png");
  
  Thread.sleep(1000);
  screen.click(location);
  Thread.sleep(1000);
  screen.click(computer);
  Thread.sleep(1000);
  screen.click(data);
  Thread.sleep(1000);
  screen.click(open);
  Thread.sleep(1000);
  screen.click(file);
  Thread.sleep(1000);
  screen.click(open);
  Thread.sleep(1000);
  
  driver.findElement(By.xpath("//*[@id='container']/div/form[1]/div/div[2]/div[2]/button")).click();
  
  driver.close();
  
	return true;
	
	}
	
	
	public void run(WebDriver driver)  throws IOException, SQLException, InterruptedException, FindFailed{
		
		sikulifileupload(driver);
		
			
		
	}
	
	
	
	public static void main(String[] args)throws IOException, SQLException, InterruptedException, FindFailed {
		
		
		Sikuli1 t = new Sikuli1();	
		Regular r = new Regular();
		
		WebDriver driver = r.invokeBrowser();
		
		
		r.login(driver);
		t.run(driver);
		
}
}