package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.googlesearchpage;

public class test1_googlesearchtest {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
        googlesearch();
 
	}
	
	//elements are imported from the other script googlesearchpage.java
	public static void googlesearch()
	{
		String key="webdriver.chrome.driver";
        String value="./driverss/chromedriver.exe";
        System.setProperty(key, value);
		driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		googlesearchpage.textbox_search(driver).sendKeys("automation step by step");
		
		//googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
		
		//WebDriverWait to give the page time to render the button:
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		searchButton.click();
		
		driver.close();
		
		System.out.println("Test completed");
		
	
	}
}