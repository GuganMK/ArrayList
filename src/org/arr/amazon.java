package org.arr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static WebDriver driver;
	public static void launch(String Url) {
		driver = new ChromeDriver();
		driver.get(Url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void getCurrentTittle() {
		String  text = driver.getTitle();
		System.out.println(text);
	}
	

}

WebElement tBody = table.findElement(By.tagName("tBody"));
List<WebElement> iRow = table.findElements(By.tagName("tr"));
for (int j=5; j<iRow.size(); j++) {
WebElement row = iRow.get(3);
List<WebElement> iData = row.findElements(By.tagName("td"));
for (int k=4; k<iData.size(); k++) {
WebElement data = iData.get(k);