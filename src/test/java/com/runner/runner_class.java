package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Nila\\eclipse-workspace\\Lime_Road_\\src\\test\\java\\com\\feature\\Lime.feature",
		         glue="com.step",
		         plugin = {"pretty",
		        		  "json:Resources/lime.json",
		        		  "html:Res/lime.html",
		        		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class runner_class extends Base_Class {

@BeforeClass
public static void browserlaunch() {
launchBrowser("chrome");	
}
}
