package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class Guru99Step {
	WebDriver driver;
	
	@Given("user captures title")
	public void user_captures_title() {
	    
	 driver= new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 System.out.println(driver.getTitle());
	}

}
