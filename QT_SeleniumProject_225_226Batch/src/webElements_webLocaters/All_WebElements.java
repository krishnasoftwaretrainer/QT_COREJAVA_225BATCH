package webElements_webLocaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class All_WebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//1.First Name
		WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		FirstName.sendKeys("Krishna");
		
		//2.Last Name
		WebElement LastName=driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		LastName.sendKeys("Kumar");
		
		//3.Address
		WebElement Address=driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]"));
		Address.sendKeys("Ameerpet,\n Hyderabad,\nTelengana,\nIndia");

		//4.Email address
		WebElement Email=driver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
		Email.sendKeys("krishna@gmail.com");
		
		//5.Phone
		WebElement Phone=driver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
		Phone.sendKeys("9876543210");
		
		//6.Gender
		//WebElement MGender =driver.findElement(By.cssSelector("input[name=\"radiooptions\"]"));
		//MGender.click();
		Thread.sleep(2000);
		//6.Gender
		WebElement FGender =driver.findElement(By.cssSelector("input[value=\"FeMale\"]"));
		FGender.click();
		
		

		
	}

}
