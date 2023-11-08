package com.Prroject.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	public static WebDriver driver;
public static void initilisation() {
	driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
}

public void failed(String testmethodName) {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src,new File("C:\\Users\\mbala\\eclipse-workspace\\Java\\screenshot\\"+testmethodName+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
