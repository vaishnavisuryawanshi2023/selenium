package com.vaishnavi.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_01 {
public static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\OneDrive\\Desktop\\seleniumedureka.java\\Selenium_testing\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.facebook.com");
		/*driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		WebElement mailid = driver.findElement(By.name("email"));
		mailid.sendKeys("xyzpqrvss2222@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("zaqmlp1092");
		driver.findElement(By.name("login")).click();
		
		//driver.quit();
		//driver.close();

	}

}
