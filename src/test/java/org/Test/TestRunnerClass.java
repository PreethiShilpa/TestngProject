package org.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\paraBank.feature",
glue="org.steps",
monochrome=true,
dryRun=false
)

public class TestRunnerClass {

}
