package com.librerianacional.certification.LibreriaNacional.runners;

import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/feature/google_translate.feature", 
		glue = "com.librerianacional.certification.LibreriaNacional.stepdefinitions"
)


public class GoogleTranslateRunner {

}
