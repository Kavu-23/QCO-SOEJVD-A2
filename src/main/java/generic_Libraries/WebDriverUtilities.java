package generic_Libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {

	//1.Mouse Hovering
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//2.Double clicking
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.doubleClick(ele).perform();
	}

	//3.Right click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a= new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	

}
