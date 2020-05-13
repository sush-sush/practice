package practice;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElementLocaters2 {
	
	
	@Test
	public void practice1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://objectspy.space/");
		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#sex-0")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Female']")).click();
		driver.findElement(By.cssSelector("input#exp-5")).click();
	
		Thread.sleep(3000);
		
		
		driver.close();
		driver.quit();
		
	}

}
