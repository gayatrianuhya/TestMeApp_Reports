package cucumbertesting123;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class )
@CucumberOptions(features="Feature456",glue="cucumbertesting123",plugin={"html:target/cucumber-htmlreport.html","json:target/cucumber.json"})


public class Runnerclass_123 {
	

}
