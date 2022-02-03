package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public static void main(String[] args) throws InterruptedException, AWTException
{
System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver = new FirefoxDriver();
driver.get("https://www.google.com/");
Thread.sleep(2000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_T);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_T);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_T);
Set<String>ids=driver.getWindowHandles();
ArrayList<String> array=new ArrayList<String>(ids);
String child = array.get(3);
driver.switchTo().window(child);
}
}


