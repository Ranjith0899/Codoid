package task.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static WebDriver driver;
public static void switchToFrame (Object o, String by){
	if (by.equalsIgnoreCase("id")) {
		driver.switchTo().frame((String)o);
	}
	if (by.equalsIgnoreCase("name")) {
		driver.switchTo().frame((String)o);
	}
	if (by.equalsIgnoreCase("index")) {
		driver.switchTo().frame((int)o);
	 if (by.equalsIgnoreCase("WebElement")) {
		driver.switchTo().frame((WebElement)o);	
	   }
	}
}
   public static void switchToDefult (){
	driver.switchTo().defaultContent();
   }
   
   public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	//switching with index
    switchToFrame(2, "index");
    // performing some action in the frame and switching to default content
    WebElement ele = driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/div[1]/div[1]/div/h1[contains(text(),'HTML ')]"));
    System.out.println(ele.getText());
    switchToDefult();
     
	//switching with id
    switchToFrame("frm2", "id");
    // performing some action in the frame and switching to default content
    driver.findElement(By.id("firstName")).sendKeys("Ranjith");
    switchToDefult();
    
    driver.quit();
    
   }
}
