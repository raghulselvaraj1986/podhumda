package poptests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import popobjects.homepage;
import popobjects.loginpage;

public class tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/aswiniraghul/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		loginpage lp=new loginpage(driver);
		lp.username().sendKeys("login");
		lp.password().sendKeys("password");
		lp.Home().click();
		
		homepage hp=new homepage(driver);
		hp.query().sendKeys("infosys");
		
		

	}

}
