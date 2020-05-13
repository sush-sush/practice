package assign1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	WebDriver driver;
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
	@Test
	public void login() throws InterruptedException {
	driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	String expected = "Welcome: Mercury Tours";
	String actual = driver.getTitle();
	
	if(expected.equalsIgnoreCase(actual)) {
		System.out.println("Test Passed!" + "Titles Matched");
	}else {
		System.out.println("Test failed.Title did not match");
	}
	
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
	Boolean button1 = driver.findElement(By.linkText("SIGN-OFF")).isDisplayed();
	if (button1==true) {
		System.out.println("Sign Off button is displayed. ");
	}else {
		System.out.println("No Sign-Off Button");
	}
	
	}
	
	@After
	public void teardown() {
	driver.close();
	driver.quit();
	}
}
