package com.gurung.jenkinsDemo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	
	WebDriver driver;
    @Test
    public void shouldAnswerWithTrue()
    {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.bbc.com/");
    	String titleBBC=driver.getTitle();
    	System.out.println(titleBBC);
    	
    	
    	try {
    		Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        Assert.assertEquals(titleBBC, "BBC - Homepage");
        
        driver.close();
        driver.quit();
        
    }
}
