package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterisation {
	
	WebDriver driver=null;

		@Given("User opens the application")
		public void user_opens_the_application() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers And Drivers\\chromedriver_win32\\chromedriver.exe");
			   driver =new ChromeDriver();
			   String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
			   driver.get(url);
			   driver.manage().window().maximize();

		    
		}

		@When("User clicks on to signin link")
		public void user_clicks_on_to_signin_link() {
			driver.findElement(By.linkText("SignIn")).click();
			System.out.println("the title of the page is"+driver.getTitle());
					}

		@When("User enters {string} and {string}")
		public void user_enters_and(String username, String password) {
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.name("Login")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
			driver.close();
		}

		@Then("Message displayed Login Successfully")
		public void message_displayed_Login_Successfully() {
		   System.out.println("executed sucessfully");
		}


}
