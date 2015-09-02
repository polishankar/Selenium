package assistOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.redbus.in/?xtor=SEC-1011[redBus+Branded]-GOO-[redBus%28E%29]--S-redbus&gclid=CjwKEAjwmZWvBRCCqrDK_8atgBUSJACnib3lahzj_WfUKjxv6j16E3WxhLxL_e319IBfi8wi_mHewBoCm2jw_wcB");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtSource")).sendKeys("Bangalore");
		driver.findElement(By.id("txtDestination")).sendKeys("vishakapatnam");
		driver.findElement(By.id("txtOnwardCalendar")).click();

		String date = "10-september 2015";
		String spletter[] = date.split("-");
		String checkInday = spletter[0];
		String checkInmonth_year = spletter[1];
		

		 driver.findElement(By
				.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]/tbody/tr[5]/td[4]")).click();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	 
		 driver.findElement(By
					.xpath("//*[@id='searchBtn']")).click();
		 
		 driver.findElement(By
					.xpath("//*[@id='onwardTrip']/div[2]/ul/li[2]/div/div[8]/button")).click();
			
			 driver.findElement(By
						.xpath("//*[@id='onwardTrip']/div[2]/ul/li[2]/div/div[9]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/ul/li[36]/a")).click();
			 
	 
		}

	}

