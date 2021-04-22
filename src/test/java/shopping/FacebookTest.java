package shopping;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {

	@Test

public  void LoginButton () {
		System.setProperty("webdriver.chrome.driver" ,  "/Users/bmaramis/Documents/Batch6/ecpliseWorkPlace/TechCircle-Batch6-Automation/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		//assertTrue("Checking if the login button exists",isElementPresent(driver,By.xpath("//button [@name='login']"));
		assertTrue("Checking if the Login buton is exist",isElementPresent(driver,By.xpath("//button[@data-testid='royal_login_button' ]")));
		driver.close();
	}
	

public static boolean isElementPresent(WebDriver driver, By locatorKey) {
    try {
        driver.findElement(locatorKey);
        return true;
    } catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}

}
