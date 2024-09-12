package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//features//AccountCreation.feature",".//features//SignUP.feature"
    		
    },
    glue = {"stepDifinitionss"},
    		plugin= {
            	    "pretty", "html:reports/Cucumber_report.html", 
            		"json:reports/myreport.json",
            		"rerun:target/return.txt", //Mandatory to capture failures
            		}, 
    monochrome = false
)
public class TestRunner{

}
