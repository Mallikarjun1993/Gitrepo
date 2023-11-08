package com.Prroject.baseclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomerListener.class)
public class ScreenshotTest extends BaseClass{
@BeforeMethod
public void setup() {
	initilisation();
}
@AfterMethod
public static void close() {
	driver.quit();
}
@Test
public void takescreenshot1() {
	Assert.assertEquals(true, true);
	
}
@Test
public void takescreenshot2() {
	Assert.assertEquals(true, true);
	
}
@Test
public void takescreenshot3() {
	Assert.assertEquals(true, true);
	
}

}
