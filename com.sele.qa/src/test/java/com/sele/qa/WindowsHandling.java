package com.sele.qa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

    public static void main(String[] args) {
		
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.get("http://www.leafground.com/pages/Window.html");
    	driver.manage().window().maximize();
    	String oldwin =driver.getWindowHandle();
    	WebElement w1 =driver.findElement(By.id("home"));
    	w1.click();
    	System.out.println("parent windwo Id" +oldwin);
    	Set<String> Handles =driver.getWindowHandles();
    	for (String newwin : Handles) {
			driver.switchTo().window(newwin);
			
		}
    	WebElement editbox =driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']"));
    	editbox.click();
    	driver.close();
    	driver.switchTo().window(oldwin);
    	WebElement Multiple =driver.findElement(By.xpath("//*[text()='Open Multiple Windows']"));
    	Multiple.click();
    	int noofwindows=driver.getWindowHandles().size();
    	System.out.println("numberofwindowsopend"+noofwindows);
    	WebElement dontcloseme =driver.findElement(By.xpath("//*[text()='Do not close me ']"));
    	dontcloseme.click();
    	Set<String>newwindowhandles=driver.getWindowHandles();
    	for (String allwindows : newwindowhandles) {
    	  if(!allwindows.equals(oldwin))
    	  {
    		driver.switchTo().window(allwindows);
    		driver.close();
    	  }
    	  driver.quit();
		}
    	
    	
    	
	}
	
}
