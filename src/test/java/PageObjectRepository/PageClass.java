package PageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageClass {

	WebDriver driver;
	By Inc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	
	public PageClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clicklink(){
		driver.findElement(Inc).click();
	}
	
	public void typename(String username) {
		driver.findElement(uname).sendKeys("swati123@gmail.com");
	}
	
	public void typepassword(String password) {
		driver.findElement(pwd).sendKeys("swati123");
	}
	
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
}
	
