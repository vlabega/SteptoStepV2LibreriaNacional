package com.librerianacional.certification.LibreriaNacional.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.librerianacional.certification.LibreriaNacional.models.TranslateExpression;
import com.librerianacional.certification.LibreriaNacional.questions.TheResult;
import com.librerianacional.certification.LibreriaNacional.tasks.GoTo;
import com.librerianacional.certification.LibreriaNacional.tasks.OpenTheBrowser;
import com.librerianacional.certification.LibreriaNacional.tasks.TraslateTask;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleAppsComponent;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleHomePage;

import io.cucumber.java.Before;
//import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.When;

//import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;



public class GoogleTraslateStepDefinitions {

	// Inicializamos el Driver
	@Managed(driver = "chrome") // debe estar en la raiz del proyecto
	private WebDriver hisBrowser;
	


	private Actor vlady = Actor.named("Vlady");
	// Instancia
	private GoogleHomePage googleHomePage;
	// Instancio otro para abrir

	// Metodo para asociar el actor al driver, el actor puede navegar en la web con
	// el driver
	@Before
	public void setup() {
		vlady.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		
	}

	@Given("^that (.*) opens his browser at (.*)$")
	public void thatTheUserOpensHisBrowserAtThePage(String name, String webpage) throws Exception {
		vlady.wasAbleTo(OpenTheBrowser.at(googleHomePage));

	}

	@Given("^he goes to (.*)$")

	public void theUserGoesTo(String googleApp) throws Exception {
		vlady.wasAbleTo(GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^he traslates the word (.*) from (.*) to (.*)$")
	public void theUserTraslatesTheWordFromTo(String word, String sourceLanguage, String targetLanguage)
			throws Exception {

		// En la capa de modelo debemos crear un modelo para este envio de parametros.
		System.out.println(word +"/n"+sourceLanguage +"/n" + targetLanguage);

		// vlady.attemptsTo(TraslateTask.the(GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH,
		// GoogleTranslatePage.TARGET_LANGUAGE_SPANISH, word));

		// crear el new y luego adicionar los parametros en add
		vlady.attemptsTo(TraslateTask.the(new TranslateExpression(sourceLanguage, targetLanguage, word)));

		// A�adirle al metodo los parametros add.

	}

	@Then("^he should see the word (.*) in the screen$")
	public void theUserShouldSeeTheExpectedWordInTheScreen(String expectedWord) throws Exception {
		// Los question se hacen con : actor.should(sseThat(real value, expected value))
		// import del seethat (import static
		// net.serenitybdd.screenplay.GivenWhenThen.*;)
		// los MAtcher son con hamcrest (equalto(""))
		// El nombre del metodo siempre es un articulo
		vlady.should(seeThat(TheResult.is(), equalTo(expectedWord)));
	}

}
