package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ccsSelector {
	
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
		//address of email text field
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kaveri");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ghhfdcg");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}
		

}
