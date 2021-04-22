package shopping;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookShoppingTest {
@Test
public void buyingABook () {
	System.setProperty("webdriver.chrome.driver" ,  "/Users/bmaramis/Documents/Batch6/ecpliseWorkPlace/TechCircle-Batch6-Automation/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver ();
	driver.get ("http://google.com");

}
}
