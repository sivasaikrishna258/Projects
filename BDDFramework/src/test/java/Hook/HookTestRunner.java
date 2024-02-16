package Hook;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features="src.test.resources/Hookimplementation\\HookEx.feature",
glue= {"Hook"},
dryRun=true,
monochrome=true,
plugin={"pretty","html:target/htmlreports"})
public class HookTestRunner {

}
