package task.two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
public static WebDriver launch (String browser){
	WebDriver driver = null;
	// i'm using selenium 4.8.0 so there is no need to set system.setProperties() or WebdriverManager
	if (browser.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	}
	else if (browser.equalsIgnoreCase("FireFox")) {
		driver = new FirefoxDriver();
	}
    else if (browser.equalsIgnoreCase("Edge")) {
		driver = new EdgeDriver();
	}
    else if (browser.equalsIgnoreCase("InternetExplorerDriver")) {
		driver = new InternetExplorerDriver();
	}
	return driver;
}
public static String[] s = {"Chrome","Edge","FireFox","InternetExplorerDriver"};
public static WebDriver driver;
public static void main(String[] args) {
	for (int i = 0; i <s.length; i++) {
		driver = launch(s[i]);
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
}
}
