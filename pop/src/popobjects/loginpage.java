package popobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	
	By username=By.xpath("//input[@name='login']");
	By password= By.name("passwd");
	By Home= By.linkText("Home");
	
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement username() {
		return driver.findElement(username);
		
	}
	
	public WebElement password() {
		return driver.findElement(password);
	
	}
	
	public WebElement Home() {
		return driver.findElement(Home);
	}

}
