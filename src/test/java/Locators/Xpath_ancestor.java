package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_ancestor {
	
	public static void main(String[] args) throws Throwable{
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		//for maximizing
		driver.manage().window().maximize();

		//to open the browser
		driver.get("https://www.amazon.in/s?k=lenovo+laptops&crid=3AP6SA17N7YYW&sprefix=lenovo%2Caps%2C224&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_2_6");
		
		WebElement price=driver.findElement(By.xpath("(//span[contains(text(),'Lenovo IdeaPad Slim 5 Intel Core i5 1240H 16')])[3]/ancestor::div[@id='centerCol']//span[@class='a-price-whole']"));
		System.out.println(price.getText());
      
	}
}
