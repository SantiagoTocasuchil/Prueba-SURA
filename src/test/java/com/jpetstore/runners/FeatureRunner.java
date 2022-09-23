package com.jpetstore.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features/busqueda.feature",
        glue = "com.jpetstore.stepdefinition",
        snippets = CAMELCASE,
        tags= "")

public class FeatureRunner {

}
