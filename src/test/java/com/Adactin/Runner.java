package com.Adactin;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.configuration.Helper;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src//test//java//com//adactin1//feature",
	glue="com.stepDefinition",
	monochrome=true,
	dryRun=false,
	strict=true,
	tags=("~@regressionTest	"),
	plugin= {"html:Report/reporthtml",
			"pretty",
			"json:Reportsjson/cucu.json",
			"com.cucumber.listener.ExtentCucumberFormatter:Rebort2/cucumber.html"
	}
)
public class Runner {

public static WebDriver driver;

@BeforeClass
public static void setUp() throws Throwable {
	String browser = Helper.getinstance().getinstanceCR().getbrowser();
	driver=Base_Class.browser_launch(browser);
	Base_Class.maximize();
}

@AfterClass
public static void tearDown() {
	driver.close();
}
	
}  

