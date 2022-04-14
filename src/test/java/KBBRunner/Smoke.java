package KBBRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/"
        ,glue= "steps"
        ,dryRun=false
        ,plugin= {"pretty", "html:target/cucumber/html-default-report"
        ,"json:target/cucumber.json"
        , "rerun:target/failed.txt"}
        ,monochrome=true
        ,tags= "@smoke"

)
public class Smoke {
}

