package popobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	By query=By.xpath("//input[@id='query']");
	
	WebDriver driver;
	
	public homepage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement query() {
		return driver.findElement(query);
	}

}
