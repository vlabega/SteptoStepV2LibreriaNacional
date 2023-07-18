package com.librerianacional.certification.LibreriaNacional.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;

import com.librerianacional.certification.LibreriaNacional.exceptions.CauseResultNotWaited;
import com.librerianacional.certification.LibreriaNacional.questions.TheResultAccountPage;
import com.librerianacional.certification.LibreriaNacional.questions.TheResultLogin;
import com.librerianacional.certification.LibreriaNacional.tasks.Authenticate;
import com.librerianacional.certification.LibreriaNacional.tasks.OpenTheAplication;
import com.librerianacional.certification.LibreriaNacional.tasks.OpenTheHome;
import com.librerianacional.certification.LibreriaNacional.tasks.OpenTheLogin;
import com.librerianacional.certification.LibreriaNacional.tasks.SearchBook;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalAccountPage;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalHomePage;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalSearchHomePage;

import io.cucumber.java.Before;
//import cucumber.api.java.Before;
import io.cucumber.java.en.Given;
//import cucumber.api.java.en.Given;
import io.cucumber.java.en.Then;
//import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;
//import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;

public class SteptostepV2LibreriaNacionalLoginStepDefinitions {

	public static List<String> LoginList = new ArrayList<String>();

	// Inicializamos el Driver
	// Debe estar en la raiz del proyecto
	//@Managed(driver = "EdgeDriver")
	@Managed(driver = "chrome")
	private WebDriver theBrowser;

	private LibreriaNacionalHomePage librerianacionalhomepage;
	// Metodo para asociar el actor al driver, el actor puede navegar en la web con
	// el driver
	private Actor user = Actor.named("user");

	@Before
	public void setup() {
		user.can(BrowseTheWeb.with(theBrowser));
	}

	/*
	 * private LibreriaNacionalHomePage librerianacionalhomepage;
	 * 
	 * @Before public void prepareStage() { OnStage.setTheStage(new OnlineCast()); }
	 */

	// Background
	// Login
	@Given("^that the User want do login in the application$")
	public void thatTheUserWantDoLoginInTheApplication() throws Exception {
		theBrowser.manage().window().maximize();
		user.wasAbleTo(OpenTheAplication.at(librerianacionalhomepage));
		user.wasAbleTo(OpenTheLogin.at(null));
	}

	@When("^he enter credentials$")
	public void heEnterCredentials(List<String> credentials) throws Exception {

		// LoginList.add(0, "vlabega@gmail.com");
		// LoginList.add(1, "1234zzzz");

		System.out.println("Captura nuevos datos");
		// JOptionPane.showMessageDialog(null, LoginList.get(1));
		// JOptionPane.showMessageDialog(null, LoginList.get(0));

		// Asignacion de nuevos valores (Esto debe ir en una Clase a parte)
		String usuariomail = JOptionPane.showInputDialog("Introduce Mail Registrado: ");
		LoginList.add(0, usuariomail);
		String password = JOptionPane.showInputDialog("Introduce Password: ");
		LoginList.add(1, password);

		System.out.println("enviala lista para autenticar");
		user.attemptsTo(Authenticate.withThe(LoginList));
		Thread.sleep(1000);
	}

	@Then("^he must access the homepage$")
	public void heMustAccessTheHomepage() throws Exception {
		//user.should(seeThat(TheResultAccountPage.is(), equalTo("Hola, Vladimir!")));
		user.should(seeThat(TheResultLogin.is(), containsString("Hola, "))
				.orComplainWith(CauseResultNotWaited.class, "Loguin errado para el usuario."));
		Thread.sleep(1000);
	}

	// AdicionaralCarrito
	@Given("^User wants buy in LibreriaNacional$")
	public void userWantsBuyInLibreriaNacional() throws Exception {
		Thread.sleep(1000);
		user.wasAbleTo(OpenTheHome.go(null));
	}

	@When("^User search the books in LibreriaNacional and User add the books to cart$")
	public void userSearchTheBooksInLibreriaNacionalAndUserAddTheBooksToCart(List<String> books) throws Exception {
		// user.attemptsTo(Click.on(LibreriaNacionalAccountPage.LIBRERIANACIIONAL_LINKCLOSE));
		user.attemptsTo(SearchBook.in(books));
		Thread.sleep(1000);
	}

	@Then("^User should see the products in the cart$")
	public void userShouldSeeTheProductsInTheCart() throws Exception {
		user.should(seeThat(TheResultAccountPage.is(), containsString("Proyecto"))
				.orComplainWith(CauseResultNotWaited.class, "Productos No encontrados."));

		user.attemptsTo(Click.on(LibreriaNacionalSearchHomePage.LIBRERIANACIONAL_ACCOUNT));
		user.attemptsTo(Click.on(LibreriaNacionalAccountPage.LIBRERIANACIIONAL_LINKCLOSE));
		Thread.sleep(1000);
		System.out.println("El usuario Sale de la cuenta");
	}

}
