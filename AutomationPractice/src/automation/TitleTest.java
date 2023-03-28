package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TitleTest {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.target.com/");

		String expectedTitle = "Target : Expect More. Pay Less.";

		String actualTitle = driver.getTitle();

		System.out.println(actualTitle);

		if (expectedTitle.equalsIgnoreCase(actualTitle)) {

			System.out.println("Test case pass");
		} else {

			System.out.println("Test case fail");

		}

		driver.quit();

	}

}
