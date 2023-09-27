package com.sele.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonscrollup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		for(int i=1;i<=100;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			
		}
		for(int i=1;i<=100;i++)
		{
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_UP);
			Thread.sleep(1000);
			
		}
	}

		
	}


