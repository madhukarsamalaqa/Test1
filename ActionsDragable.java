package wscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://jqueryui.com/draggable/");
		
		WebElement frame= driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDropBy(source, 150, 150).build().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
	}

}
