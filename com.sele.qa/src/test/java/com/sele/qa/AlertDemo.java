package com.sele.qa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		 WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		 
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
		ele.click();
		Alert al= driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		WebElement ele1= driver.findElement(By.xpath("//*[@onclick='confirmAlert()']"));
		ele1.click();
		
		Alert a2= driver.switchTo().alert();
		Thread.sleep(2000);
		a2.dismiss();
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']"));
		ele2.click();
		Alert a3= driver.switchTo().alert();
		a3.sendKeys("SK");
		a3.accept();
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.xpath("//*[@onclick='lineBreaks()']"));
		ele3.click();
		Alert a4 = driver.switchTo().alert();
		
	String s=a4.getText();
	a4.accept();
	System.out.println(s);
	
		
		
	}
}
