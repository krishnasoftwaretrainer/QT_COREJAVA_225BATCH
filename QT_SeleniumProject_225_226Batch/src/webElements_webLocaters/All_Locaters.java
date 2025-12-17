package webElements_webLocaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass_Config.ChromeBrowser_Config;

public class All_Locaters extends ChromeBrowser_Config {

	public void ID_Locater() {

		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("Krishna@gmail.com");

	}

	public void Name_Locater() {

		WebElement Password = driver.findElement(By.name("pass"));
		Password.send
	}
	
	public static void main(String[] args) throws InterruptedException {
		All_Locaters loc = new All_Locaters();
		loc.chromeBrowserLaunch();
		loc.OpenUrl("https://www.facebook.com/");
		loc.ID_Locater();
		loc.AllDriverClose();

	}
}
