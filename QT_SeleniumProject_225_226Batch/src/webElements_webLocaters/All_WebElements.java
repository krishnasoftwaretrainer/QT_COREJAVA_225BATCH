package webElements_webLocaters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		// 1.First Name
		WebElement FirstName = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		FirstName.sendKeys("Krishna");

		// 2.Last Name
		WebElement LastName = driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		LastName.sendKeys("Kumar");

		// 3.Address
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		Address.sendKeys("Ameerpet,\n Hyderabad,\nTelengana,\nIndia");

		// 4.Email address
		WebElement Email = driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
		Email.sendKeys("krishna@gmail.com");

		// 5.Phone
		WebElement Phone = driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
		Phone.sendKeys("9876543210");

		// 6.Gender
		// WebElement MGender
		// =driver.findElement(By.cssSelector("input[name=\"radiooptions\"]"));
		// MGender.click();
		//Thread.sleep(2000);
		// 6.Gender
		WebElement FGender = driver.findElement(By.cssSelector("input[value=\"FeMale\"]"));
		FGender.click();
		
		// 7.Hobbies
		/*
		WebElement Hobbies_Cricket = driver.findElement(By.id("checkbox1"));
		Hobbies_Cricket.click();
		WebElement Hobbies_Movies = driver.findElement(By.id("checkbox2"));
		Hobbies_Movies.click();	
		WebElement Hobbies_Hockey = driver.findElement(By.id("checkbox3"));
		Hobbies_Hockey.click();
		
		
		*/
		//For Loop
		List<WebElement> Hobbies=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		//Hobbies.click();
		for(int i=0;i<Hobbies.size();i++)
		{
			Hobbies.get(i).click();
			//Thread.sleep(1000);
		}
		
		//Scroll WebPage Top to Bottom
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//8.Languages
		WebElement Languages=driver.findElement(By.id("msdd"));
		Languages.click();
		//English Language
		WebElement Language_English=driver.findElement(By.xpath("//a[text()='English']"));
		Language_English.click();
		Thread.sleep(2000);
		
		//Japanese Language
		WebElement Language_Japanese=driver.findElement(By.xpath("//a[text()='Japanese']"));
		Language_Japanese.click();
		
		//Click outside to close the language dropdown
		js
		

	}

}
