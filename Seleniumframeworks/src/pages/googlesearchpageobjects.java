package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlesearchpageobjects {

WebDriver driver=null;	
By textbox_search = By.id("APjFqb");	
By button_search = By.name("btnk");
	
//The reason the constructor is used here is to pass the WebDriver instance from your 
//test class into the Page Object class so that this page class can use the same browser session.	
public googlesearchpageobjects(WebDriver driver)
{
	this.driver=driver;
}
	
public void settextinsearchbox(String text)
{
	driver.findElement(textbox_search).sendKeys(text);
}
public void clicksearchbutton()
{
	//driver.findElement(button_search).sendKeys(Keys.RETURN);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement button_search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
	button_search.click();
}
}
