package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_traversing {
	
	public static void main(String[] args) throws Throwable{
		//driver related statement
		WebDriverManager.edgedriver().setup();
		//opens the empty browser
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);
		//for maximizing
		driver.manage().window().maximize();
		
		
		//to open the browser
		driver.get("https://www.amazon.in/s?k=samsung+mobile&crid=1ZAZFNBN5V8JU&sprefix=sam%2Caps%2C298&ref=nb_sb_ss_inft-rank-pairwise-override-in-t3_4_3");
        WebElement value=driver.findElement(By.xpath("//span[text()='Samsung Galaxy M13 (Stardust Brown, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']/../../../../..//span[@class='a-price-whole']"));
        System.out.println(value.getText());
	}

}
