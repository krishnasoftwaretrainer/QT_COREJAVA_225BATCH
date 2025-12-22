package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Navigation_Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		//Screen Shot-1
		File sc1=((TakesScreenshot) driver). getScreenshotAs (OutputType.FILE);
		Files.copy(sc1, new File( "C:\\Users\\HP\\OneDrive\\Desktop\\ RegForm1.png"));
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		
		//Backward
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Frorward 
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		//Refresh
		driver.navigate().refresh();
		
		System.out.println("Test Completed Successfully");
		
		driver.quit();

	}

}
