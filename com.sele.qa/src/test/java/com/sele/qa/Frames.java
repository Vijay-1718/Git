package com.sele.qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();		
        driver.get("http://www.leafground.com/pages/frame.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement ele =driver.findElement(By.id("Click"));
        ele.click();
        
       String s1 =driver.findElement(By.id("Click")).getText();
       System.out.println(s1);
       
       driver.switchTo().defaultContent();
       driver.switchTo().frame(1);
       driver.switchTo().frame("frame2");
       WebElement ele1=driver.findElement(By.id("Click1"));
       ele1.click();
       driver.switchTo().defaultContent();
       //driver.switchTo().parentFrame();
       //driver.switchTo().parentFrame();
       List<WebElement> l1=driver.findElements(By.tagName("iframe"));
      int size= l1.size();
       System.out.println(size);
       
    
    }
}
