package edu_test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases" ,  monochrome=true,
          snippets = SnippetType.CAMELCASE,
          
          glue = {"Edu_Test"}
)

public class loginAcceptance {

}
