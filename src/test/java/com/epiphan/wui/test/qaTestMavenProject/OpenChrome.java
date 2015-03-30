package com.epiphan.wui.test.qaTestMavenProject;


import java.awt.List;
import java.util.concurrent.TimeUnit;






import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenChrome {

	public static WebDriver createChrome() {
		
		System.out.print("Open Chrome Browser!!\n");
		
		//Set the chrome driver location(This is different on jenkins(ubuntu) and local)
		
		//jenkins location
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		
		//local mac location
		System.setProperty("webdriver.chrome.driver", "/Users/Epiphan/Documents/workspace/chromedriver/chromedriver");
		
		
		// Create a new instance of the Chrome driver 5max
		 
        WebDriver driver = new ChromeDriver();
		return driver;
		
	}

	
	

}
