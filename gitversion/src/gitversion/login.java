package gitversion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
        String value="./driverrr/chromedriver.exe";
        System.setProperty(key, value);
        ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();
        
        
        
        
        d.get("http://106.51.74.69:8796/login");
        d.findElement(By.xpath("//input[@name='login']")).sendKeys("HR3@career.com");
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
        Thread.sleep(1000);
        
        d.findElement(By.xpath("//span[text()='Login']")).click();
        Thread.sleep(2000);
        
//        d.findElement(By.xpath("//span[text()='New Company']")).click();
//        Thread.sleep(1000);

	}

}
