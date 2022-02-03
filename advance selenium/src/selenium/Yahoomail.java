package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Yahoomail 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://login.yahoo.com/?.intl=us");
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("mahesh.kari@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='password']")).sendKeys("7007278423");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@title='Mail']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@role='button']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("geeta.mohan1992@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("mail");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("hi    how are you");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@title='Send this email']")).click();
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//img[@class='_yb_1an6h']"));
Actions act=new Actions(driver);
act.moveToElement(ele).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[.='Sign out']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='_yb_1unnp _yb_u4nq8']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("geeta.mohan1992@yahoo.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ge88848.1992");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@value='Next']")).click();
Thread.sleep(2000);
WebElement alt = driver.findElement(By.xpath("//img[@class='_yb_1an6h']"));
Actions acti=new Actions(driver);
act.moveToElement(alt).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@class='_yb_1tc2t _yb_cj31j _yb_1tcfl']")).click();

}
}
