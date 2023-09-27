package com.sele.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

public static void main(String [] args)
 {
  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.redbus.in/");
  driver.manage().window().maximize();
  driver.findElement(By.xpath("//*[@data-message='Please enter a source city']")).sendKeys("chennai");
  driver.findElement(By.xpath("//*[@data-message='Please enter a destination city']")).sendKeys("Madurai");
  ((WebElement) By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[6]")).click();
  driver.findElement(By.id("search_btn")).sendKeys(Keys.ENTER);
  
  
}
}
