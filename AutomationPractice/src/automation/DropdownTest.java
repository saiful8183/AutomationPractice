package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	

	public static void main(String[] args) {

		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Saiful Chowdhury\\Desktop\\Drivers\\geckodriver.exe");

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(" https://www.roimotors.com/");
		
		
		WebElement dropdown=driver.findElement(By.xpath("//a[@value='Any Type']"));
		Select selectobject=new Select(dropdown);
	
		selectobject.selectByIndex(2);*/
		
	
		
		
		//driver.quit();
		
	}

}
