package com.sele.qa;
	import java.util.LinkedHashMap;
	import java.util.List;
	import java.util.Map;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class ProjectDemo {	
		
		public void productStore() {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/");
			
			driver.manage().window().maximize();
			
			Map<String,String> mob= new LinkedHashMap<>();
			
			List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='hrefch']"));
			
			List<WebElement> findElements2 = driver.findElements(By.tagName("h5"));
			
			for(int i=0; i<findElements.size();i++) {
				
				WebElement ele = findElements.get(i);
				
				String text2 = ele.getText();
					
					WebElement ele1 = findElements2.get(i+4);
					
					String text1 = ele1.getText();
					
				mob.put(text2, text1);
				
			}
			
			System.out.println(mob);
			
			}

		public static void main(String[] args) {
			
			ProjectDemo d=new ProjectDemo();
			
			d.productStore();
			
			
		}

	}

