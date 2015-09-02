package assistOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/polin/Desktop/selenium/drop%20Multiple.html");
		//single Select
		WebElement ele = driver.findElement(By.name("Mobiles"));
		Select set = new Select(ele);
		set.selectByIndex(1);
		set.selectByVisibleText("HTC");
		
		//Multiple Select
		WebElement element= driver.findElement(By.name("Mobdevices"));
		
		//Select specific items in list
		Select se = new Select(element);
		se.selectByIndex(1);
		se.selectByVisibleText("HTC");
		
		//List items 
		
		List<WebElement> options = se.getOptions();
		for(WebElement webElement: options){
			System.out.println(webElement.getText());
		}
		
		//1st option
		
		WebElement firstOption = se.getFirstSelectedOption();
		System.out.println("The First selected option is::" +firstOption.getText());
		
		//is multiple or not
		
		if(se.isMultiple())
		{
		System.out.println("Select tag allows multiple selection");	
		}
		else
		{
		System.out.println("Select does not allow multiple selections");
		}
	}

}
