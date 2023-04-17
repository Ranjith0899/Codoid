package task.two;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
public static WebDriver driver;
    // method to open multiple windows for list of elements from web page
	public static void newWindows(List<WebElement> e){
		for (WebElement webElement : e) {
			webElement.sendKeys(Keys.CONTROL, Keys.RETURN);
		}	
	}
	// method to switch to window by index using list
	public static void switchByIndex(int index){
		Set<String> set = driver.getWindowHandles();
		List<String> l = new LinkedList<String>(set);
		driver.switchTo().window(l.get(index));
	}
	// method to switch to window by page title using for each loop
	public static void SwitchByTitle(String title){
		Set<String> set = driver.getWindowHandles();
	for (String string : set) {
		if (driver.switchTo().window(string).getTitle()==title) {
			break;
		}
	 }
	 }
	// method to find list of web elements
   public static List<WebElement> find_Elements(String xpath){
	 return driver.findElements(By.xpath(xpath));	
	}
   
	public static void main(String[] args) {
		// i'm using selenium 4.8.0 so there is no need to set system.setProperties() or WebdriverManager
		driver = new ChromeDriver();
		//time outs to avoid synchronization error
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//opening multiple windows
		newWindows(find_Elements("//h2[contains(text(),'Styles for men')]//parent::div//following-sibling::div/div/div/a"));
		// switching window by index
		switchByIndex(2);
		// switching window by title
		String title = "Luggage store: Buy trolley bags, suitcases & luggage bags online";
		SwitchByTitle(title);
		driver.quit();
}}

