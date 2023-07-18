package com.librerianacional.certification.LibreriaNacional.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

		features = "src/test/resources/feature/feature.feature", 
		glue = "com.librerianacional.certification.LibreriaNacional.stepdefinitions", 
		tags = "@SearchBook",
		snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class SteptostepV2LibreriaNacionalLoginRunner {

}
