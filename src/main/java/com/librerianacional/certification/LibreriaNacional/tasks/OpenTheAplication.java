package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalHomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheAplication implements Task {

	private PageObject page;

	public OpenTheAplication(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Carga del Browser");
		actor.attemptsTo(Open.browserOn(page));
		System.out.println("Carga de la Pagina");

		// actor.attemptsTo(Click.on(LibreriaNacionalHomePage.LIBRERIANACIONAL_HEADBAR));
		System.out.println("Selecciona opcion Mi Cuenta");
		actor.attemptsTo(Click.on(LibreriaNacionalHomePage.LIBRERIANACIONAL_MICUENTA));
		System.out.println("Selecciona opcion Iniciar Cuenta");
		actor.attemptsTo(Click.on(LibreriaNacionalHomePage.LIBRERIANACIONAL_BEGIN_SESION));
	}

	public static OpenTheAplication at(PageObject page) {
		
		//return Tasks.instrumented(OpenTheAplication.class);
		return instrumented(OpenTheAplication.class, page);
	
	}

}
