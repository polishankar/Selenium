package assistOps;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowpopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		// home page window uuid we can get here.
	     String polli = driver.getWindowHandle();
		 System.out.println(polli);
		
		driver.findElement(By.xpath("//img[@id='loginsubmit']")).click();
		// String popup = driver.getWindowHandle();
		// System.out.println(popup);
		
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		Iterator iterator = windows.iterator();
		String currentpopup;
		while (iterator.hasNext()) {
			currentpopup = iterator.next().toString();
            System.out.println(currentpopup);
			
            if(!currentpopup.equals(polli)){
            	driver.switchTo().window(currentpopup);
            	
            }
            driver.findElement(By.xpath("//img[@alt='Continue']")).click();
		}
	}
}
