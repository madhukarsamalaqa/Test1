package wscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.services.irctc.co.in/cgi-bin/bv60.dll/irctc/services/login.do");
		
		driver.findElement(By.className("buttonSubmit")).click();
		
		Alert a= driver.switchTo().alert();
		
		String x1=a.getText();
		
		System.out.println(x1);
		
		a.accept();
		//a.dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
