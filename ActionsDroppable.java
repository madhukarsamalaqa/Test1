package wscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDroppable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("http://jqueryui.com/droppable/");
		
		WebElement frame= driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement dest= driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(source, dest).build().perform();
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
