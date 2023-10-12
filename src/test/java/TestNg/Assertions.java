package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {

	
	 @Test
		public void  Fb(){
	    WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		 
		//hard assert
		//Assert.assertEquals(title,"fhgfh");
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "jfhdfbh");
		System.out.println(driver.getCurrentUrl());
	   }
	 
	 @Test
	 public void closing(WebDriver driver) throws Throwable{
		 Thread.sleep(3000);
		 driver.close();
	 }
	 
}
