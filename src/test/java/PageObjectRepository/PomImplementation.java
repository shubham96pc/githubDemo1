package PageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomImplementation {
	public static void main(String...args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers And Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	PageClass Pobject=new PageClass(driver);
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Pobject.clicklink();
	String username= null;
	Pobject.typename(username);
	String password= null;
	Pobject.typepassword(password);
	Pobject.clickOnLogin();
	System.out.println("title of the page is"+driver.getTitle());
	}

}
