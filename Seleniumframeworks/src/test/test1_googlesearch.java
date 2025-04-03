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
		try {
            // Open Google
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

            // Wait until the search box is visible
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

            // Enter search query
            searchBox.sendKeys("BTS");

            // Wait for search button and click
            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
            searchButton.click();

            // Wait for results to load
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));

            // Print page title
            System.out.println("Page Title: " + driver.getTitle());
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser after execution
        	 System.out.println("Test completed");
            driver.quit();
           
        }
    }

}