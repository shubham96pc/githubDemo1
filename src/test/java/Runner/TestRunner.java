package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome= true, features="FEATURE\\TagDemo.FEATURE", glue= {"stepdef"}, tags= {"@SmokeTest","~@End2End"}, plugin= {"html:target/CUCUMBER_NEW1.html"})

public class TestRunner {

}
