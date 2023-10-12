package basic_programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws Throwable{
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		//for maximizing
		driver.manage().window().maximize();
		
		//to open the browser
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
