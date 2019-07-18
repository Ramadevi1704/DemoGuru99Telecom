package Cucu.Cucum;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Rama\\eclipse-workspace\\Cucum\\resource.pkg",strict=true,dryRun=false,glue= {"Cucu.Cucum"},monochrome=true,plugin="json:target/report/cucumber.json")

public class TestRunner {	


}
