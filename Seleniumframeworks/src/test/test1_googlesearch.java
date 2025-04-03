package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

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
		driver.get("http://google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("BTS");
//		driver.findElement(By.xpath("//div[@jsmodel=\"b5W85 vNzKHd\"]")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnK")).click();
		//Thread.sleep(2000);
		
		driver.close();
		
		System.out.println("Test completed");
		
		
}

}