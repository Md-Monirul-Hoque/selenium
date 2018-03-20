package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli2 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		
		Screen screen = new Screen();
		String shutter=null;
		
		Pattern search = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/search.png");
		Pattern searchbox = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/SendingSearch.png");
		Pattern shuttericon = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/shuttericon2.png");
		Pattern shutterDesktop = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/shutterDesktop.png");
		Pattern shutterEdit = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/shutterEdit.png");
		Pattern cropicon = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/shuttercrop.png");
		Pattern width = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/width.png");
		Pattern height = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/height.png");
		Pattern crop = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/crop.png");
		Pattern save = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/shuttersave.png");
		Pattern hover = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/hover.png");
		Pattern close = new Pattern("/home/monirul/Desktop/Sikuli Images For Selenium/close.png");
		
		screen.click(search);
		Thread.sleep(1500);
		screen.find(searchbox);
		
		screen.write("shutter");		
		Thread.sleep(3000);
		screen.click(shuttericon);
		Thread.sleep(3000);
		screen.click(shutterDesktop);
		Thread.sleep(3000);
		screen.click(shutterEdit);
		Thread.sleep(3000);
	 /* screen.find(cropicon);
		screen.click(cropicon);
		Thread.sleep(1500);
		screen.find(width);
		screen.write("4000");
		Thread.sleep(1500);
		screen.find(height);
		screen.write("4000");
		Thread.sleep(1500);
		screen.click(crop);
		Thread.sleep(1500);
		screen.click(save);
		Thread.sleep(1500); */
		screen.hover(hover);
		Thread.sleep(1500);
		screen.click(close);

	}

}
