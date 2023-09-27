package com.sele.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.id("dropdown1"));
		Select s1 = new Select(ele);
		s1.selectByIndex(4);
		s1.selectByValue("3");
		s1.selectByVisibleText("Appium");
		
	    List<WebElement>l1 = s1.getOptions();
	    int size =l1.size();
	    System.out.println("No of Elments"+ size);
	    
	    ele.sendKeys("LoadRunner");
	    
	    WebElement ele2 =driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
	    Select s2 = new Select(ele2);
	    s2.selectByIndex(1);
	    s2.selectByIndex(2);
	    s2.selectByIndex(3);
	    boolean b = s2.isMultiple();
	    System.out.println(b);
	}
}
