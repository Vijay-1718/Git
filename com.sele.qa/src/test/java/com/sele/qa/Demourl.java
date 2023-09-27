package com.sele.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demourl
{
public static void main (String[]args)
{
  ChromeDriver driver = new ChromeDriver();
  driver.get("https://www.google.com/");
  driver.findElement(By.name("q")).sendKeys("Test");
  
}
}
