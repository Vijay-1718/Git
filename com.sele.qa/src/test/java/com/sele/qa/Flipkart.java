package com.sele.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart
{
  public static void main(String[] args) {

	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(//div /input[@type='text'])[2]")).sendKeys("8807415288");
	  driver.findElement(By.xpath("(//div /input[@type='password'])")).sendKeys("Virat@17");	  
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	  WebElement ele =driver.findElement(By.xpath("//a[@class='_2KpZ6l _3dESVI']"));
	  ele.click();
}
}
