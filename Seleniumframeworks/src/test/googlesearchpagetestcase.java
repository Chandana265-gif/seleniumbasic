package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.googlesearchpageobjects;

public class googlesearchpagetestcase {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		
     googlesearchpage();
	}

	public static void googlesearchpage()
	{
		String key="webdriver.chrome.driver";
        String value="./driverss/chromedriver.exe";
        System.setProperty(key, value);
		driver = new ChromeDriver();
		
		googlesearchpageobjects searchpageobj = new googlesearchpageobjects(driver);
		 
		driver.get("https://google.com/");
		searchpageobj.settextinsearchbox("adbc");
		
		searchpageobj.clicksearchbutton();
		
		driver.close();
	}
}
