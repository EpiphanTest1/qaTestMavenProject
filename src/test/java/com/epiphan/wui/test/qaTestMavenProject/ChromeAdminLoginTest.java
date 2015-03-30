package com.epiphan.wui.test.qaTestMavenProject;

import static junit.framework.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeAdminLoginTest {
	  private String baseUrl = System.getProperty("webdriver.base.url");
	  private String username = "admin";
      private String password =  ""; // no password by default
      private WebDriver driver;
	  
      
	  
	  private ScreenshotHelper screenshotHelper;
	  
	  
	  @Before
	  public void openBrowser() {
		  System.setProperty("webdriver.chrome.driver","/Users/Epiphan/Documents/workspace/chromedriver/chromedriver");
		  driver = new ChromeDriver();
		  //Build URL string for device
	      String URL = "http://" + username + ":" + password + "@" + baseUrl +"/admin";
	      driver.get(URL);
		  screenshotHelper = new ScreenshotHelper();
	  }
	  
	  @After
	  public void saveScreenshotAndCloseBrowser() throws IOException {
	    screenshotHelper.saveScreenshot("screenshot.png");
	    driver.quit();
	  }
	  
	  @Test
	  public void shouldDisplayAdminitratorLogin() throws IOException {
		// TODO Auto-generated method stub
			
	        
	      //implicit wait for the channel to load
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        //find "Administrator"
	        String text = driver.findElement(By.xpath("/html/body/div/div[1]/span")).getText();
	        
	        //Ensure text channel name is present
	        assertEquals(text, "Administrator");
	        System.out.println("Logged in as, "+ text + " successfully!\n");
	        // Close the driver
	      
	  }
	  
	  private class ScreenshotHelper {
	  
	    public void saveScreenshot(String screenshotFileName) throws IOException {
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File(screenshotFileName));
	    }
	  }
	}
