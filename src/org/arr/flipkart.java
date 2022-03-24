package org.arr;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\ArrayList\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/table");
	
	List<WebElement> row = driver.findElements(By.xpath("//table[@style='box-sizing:inherit;font-family:arial,sans-serif;width:819px;color:#212529;font-size:16px']/tbody/tr[3]/td"));
	List<WebElement> coloumn = driver.findElements(By.xpath("//table[@style='box-sizing:inherit;font-family:arial,sans-serif;width:819px;color:#212529;font-size:16px']/tbody/tr/td[2]"));
	
	for(int i=0; i<row.size(); i++) {
		String rows = row.get(i).getText();
		if (rows.equals("Selenium Webdriver")) {
				System.out.println(rows);
		}
	}
	for(int j=0; j<coloumn.size(); j++) {
		String coloumns = coloumn.get(j).getText();
		if (coloumns.equals("Selenium Webdriver")) {
		System.out.println(coloumns);
	}
	}}
}
