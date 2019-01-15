package popobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepagefactory {
	
	//By query=By.xpath("//input[@id='query']");
	
	@FindBy(xpath="//input[@id='query']")
	WebElement query; 
	
	WebDriver driver;
	
	public homepagefactory(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement query() {
		return query;
	}

}
