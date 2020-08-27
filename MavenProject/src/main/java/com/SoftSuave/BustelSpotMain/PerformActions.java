package com.SoftSuave.BustelSpotMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

public class PerformActions extends BaseClass {
	@BeforeClass
	public void waitForPageToGetReady()
	{
		checkPageIsReady();
	}
	
	public void sendKeys(By webElement, String text) {
		waitForElement(webElement);
		
		WebElement emailIDElement = driver.findElement(webElement);
		emailIDElement.sendKeys(text);
	}
	public void performClick(By webElement) {
		
		driver.findElement(webElement).click();
	}
	public String getText(By webElement) {
		
		WebElement textElement = driver.findElement(webElement);
		String text = textElement.getText();
		return text;
	}

}
