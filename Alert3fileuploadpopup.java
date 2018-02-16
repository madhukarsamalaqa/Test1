package wscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert3fileuploadpopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/MAD/Videos/Selenium/WebDriver/Scripts%20_%20Notes/WinAlerts.html");
		
		driver.findElement(By.id("photo")).click();
		
		Robot rb= new Robot();
		
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		
		rb.keyPress(KeyEvent.VK_P);
		rb.keyRelease(KeyEvent.VK_P);
		
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);
		
		rb.keyPress(KeyEvent.VK_1);
		rb.keyRelease(KeyEvent.VK_1);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
