package PageObjectRepository;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PageImplementation {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers And Drivers\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  PageClass_1 locateElements= PageFactory.initElements(driver, PageClass_1.class);
	  locateElements.loginMethod("swati123@gmail.com", "swati123");
  }
}
