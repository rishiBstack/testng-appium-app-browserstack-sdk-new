package com.browserstack;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SearchTest extends AppiumTest {

    @Test
    public void test2() throws Exception {

    	Thread.sleep(5000);
    	driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();

		driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Featured article");

		System.out.println("Test entered in the search box");
		driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
		
		System.out.println("Page is navigated to Featured article page");
}
}
