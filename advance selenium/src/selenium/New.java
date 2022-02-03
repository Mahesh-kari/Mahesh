package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("hello");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("heyjack");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}