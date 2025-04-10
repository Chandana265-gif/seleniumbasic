package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googlesearchpage {
	//declaring as static and private so that the variable can be used in this class only
	private static WebElement element = null;

	
	public static WebElement textbox_search(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_search(WebDriver driver)
	{
		element = driver.findElement(By.name("btnk"));
		return element;
	}
}
