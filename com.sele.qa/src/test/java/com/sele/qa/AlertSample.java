package com.sele.qa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertSample {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/Alert.html");
	    driver.manage().window().maximize();
	    WebElement ele =driver.findElement(By.xpath("//*[@onclick='normalAlert()']"));
	    ele.click();
	     Alert ale =driver.switchTo().alert();
	     ale.accept();
	     Thread.sleep(3000);
	     WebElement ele1 =driver.findElement(By.xpath("//*[@onclick='confirmAlert()']"));
	     ele1.click();
	     Alert ale1 =driver.switchTo().alert();
	     ale1.dismiss();
	     Thread.sleep(3000);
	     WebElement ele2 =driver.findElement(By.xpath("//*[@onclick='confirmPrompt()']"));
	     ele2.click();
	     Alert ale2 =driver.switchTo().alert();
	     ale2.sendKeys("Virat");
	     ale2.accept();
	     WebElement ele3= driver.findElement(By.xpath("//*[@onclick='lineBreaks()']"));
	      ele3.click();
	      Alert ale3 =driver.switchTo().alert();
	      
	     String s1 =ale3.getText();
	     ale3.accept();
	     System.out.println(s1);
	    
	     
	     
	}

}