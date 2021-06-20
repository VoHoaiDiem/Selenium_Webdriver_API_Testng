package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_01_Check_Evironment {
static WebDriver webDriver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DiemVTH");
		webDriver = new FirefoxDriver();
		webDriver.get("https://m.facebook.com/");	
	}
}
