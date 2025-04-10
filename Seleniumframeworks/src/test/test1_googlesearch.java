package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test1_googlesearch {

	public static void main(String[] args) {
		
        googlesearch();
 
	}
	
	
	public static void googlesearch()
	{
		String key="webdriver.chrome.driver";
        String value="./driverss/chromedriver.exe";
        System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("BTS");
		
		//googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
		
		//WebDriverWait to give the page time to render the button:
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		searchButton.click();
		
		driver.close();
		
		System.out.println("Test completed");
		
	}

}