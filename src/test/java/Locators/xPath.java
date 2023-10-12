package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath {

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
		//address of email text field using xpath  method
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("kaveri");
		//address of password text field using xpath contains attribute
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("ghhfdcg");
		//Thread.sleep(2000);
		//address of forgetten password with x path text contains
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
	}
}
