package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookLogin {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("WebDriver.chrome.driver","chromedriver");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
	}
	@Test
	@Parameters({"name","password"})
	public void login(String userName,String userPass) {
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys(userName);
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys(userPass);
		
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();
	}

}
