package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class XpathAxes {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();

		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		
		
		
		
		// self  (Select the current node)

		
	String text = driver.findElement(By.xpath("/html/body/div[2]/div[5]/table/tbody/tr[18]/td[1]/a/self::a"))
				.getText();
		System.out.println(text);

		
		
		// Parant  {Select the parant of the current node (always one)}

		String text2 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[18]/td[1]/a/parent::td"))
				.getText();
		System.out.println(text2);
		

		
		
		
		
		// Child {Select all childrens of the current node(One or many)}
		
		
		List<WebElement> childs = driver
				.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[18]/td[1]/a/ancestor::tr/child::td"));

		System.out.println("Number of child elements:" + childs.size());
		
		
		
		
		//Ancestor {Select all ancestors(parant,grandparants etc)}
		
		String ancestor=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[18]/td[1]/a/ancestor::tr")).getText();

		System.out.println(ancestor);
		
		
		
		
		
		
		//Descendent{Select all Descendent(Children,grand children etc)} of current node
		
		List<WebElement> descendents=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[19]/td[1]/a/ancestor::tr/descendant::*"));

		System.out.println(descendents.size());
		
		
		
		
		
		//Following (Selects everything in the document after the closing tag of the current node)
		
		
		List<WebElement> following=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[19]/td[1]/a/ancestor::tr/following::tr"));
		
		System.out.println(following.size());
		
		
		
		
		
		//Following sibling  (Select all siblings after the current node)
		
		
List<WebElement> followingsiblings=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[19]/td[1]/a/ancestor::tr/following-sibling::tr"));
		
		System.out.println(followingsiblings.size());
		
		
		
		
		//preceding( Select all nodes that appear before the current node in the document)
		
		
List<WebElement> preceding=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[19]/td[1]/a/ancestor::tr/preceding::tr"));
		
		System.out.println(preceding.size());
		
		
		//preceding-siblings( Select all siblings before the current node)
		
		
		
		
List<WebElement> precedingsiblings=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[19]/td[1]/a/ancestor::tr/preceding-sibling::tr"));
		
		System.out.println(precedingsiblings.size());
		
		
		
		
		
		
		
		
		
driver.close();

	
	}

}
