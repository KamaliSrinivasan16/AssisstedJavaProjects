package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	public String baseUrl="http://localhost:8080/seleniumTesting/";
	String driverPath = "C:\\Users\\Parthi K\\Downloads\\chromedriver.exe";
	public WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",driverPath );
	  driver=new ChromeDriver();
	  
	  driver.get(baseUrl);
	  System.out.println("the title of the page is: "+ driver.getTitle());
	  
	  List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
	  for(WebElement e: allInputElements)
	  {
		  System.out.println("id: "+e.getAttribute("id"));
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

}
