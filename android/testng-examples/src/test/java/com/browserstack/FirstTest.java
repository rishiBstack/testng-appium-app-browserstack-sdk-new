package com.browserstack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.appium.java_client.AppiumBy;

public class FirstTest extends AppiumTest {
	

    @Test
    public void test1() throws Exception {
    	 
    	driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();

 		System.out.println("First Sign in test");
    	 
    }
}
