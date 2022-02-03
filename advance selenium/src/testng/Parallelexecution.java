package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallelexecution 
{
	@Test
	public void firefox()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
   @Test
   public void chrome()
   {
	   System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
   }
}
