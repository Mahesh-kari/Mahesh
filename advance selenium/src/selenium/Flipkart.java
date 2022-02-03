package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("mahesh.kari7@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7842370072");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung mobiles");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//div[@data-id='MOBGFG79FUDPXZXQ']")).click();
	Set<String> id=driver.getWindowHandles();
	ArrayList<String> arr=new ArrayList<String>(id);
	String child = arr.get(1);
	driver.switchTo().window(child);
	Thread.sleep(2000);
	
	
	
}
}
