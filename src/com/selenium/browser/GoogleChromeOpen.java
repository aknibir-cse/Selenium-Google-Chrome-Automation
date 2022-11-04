package com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleChromeOpen {

	public static void main(String[] args) {
		
		//Path of Executable Driver Path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aknib\\eclipse-workspace\\Selenium4\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Parent p = new Child (WebDriver is Parent & ChromeDriver is Child) 

		driver.get("https://www.google.com/");
		//Opening URL
		
		System.out.println(driver.getTitle());
		//Printing Title
		
		//driver.quit();
		//Closing Browser
	}

}
