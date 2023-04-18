package task.two;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSS {
	public static WebDriver driver;
	public static void takeScreenShot(String path){
		TakesScreenshot tk = (TakesScreenshot)driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		takeScreenShot("C:\\Users\\ELCOT\\workspace\\TechnicalTask\\Snaps\\snap.png");
	}

}
