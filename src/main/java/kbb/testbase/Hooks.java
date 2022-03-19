package kbb.testbase;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import kbb.utils.CommonMethods;


public class Hooks extends CommonMethods {

    @Before
    public void start(Scenario scenario) {
        System.out.println("Starting scenario " + scenario.getName());
        setUp();
        initializeAll();
    }

    @After
    public void end(Scenario scenario) {


       tearDown();
    }
}