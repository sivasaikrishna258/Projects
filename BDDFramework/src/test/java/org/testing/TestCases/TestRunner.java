package org.testing.TestCases;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features="src.test.resources/feature",
glue= {"org.testing.TestCases"},
dryRun=false,
monochrome=true,
plugin={"pretty","html:target/htmlreports"})
public class TestRunner {

}
