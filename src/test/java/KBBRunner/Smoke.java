package KBBRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/resources/features/"
        ,glue="kbb/stepsDefinition"
        ,dryRun=false
        ,plugin= {"pretty", "html:target/cucumber/html-default-report"
        ,"json:target/cucumber.json"
        , "rerun:target/failed.txt"}
        ,monochrome=true
        ,tags= {"@smoke"}
)
public class Smoke {
}

