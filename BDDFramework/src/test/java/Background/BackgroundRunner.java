package Background;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features="src.test.resources/BackgroundImplementation\\BackgroundEx.feature",
glue= {"Background"},
dryRun=true,
monochrome=true,
plugin={"pretty","html:target/htmlreports"})
public class BackgroundRunner {

}
