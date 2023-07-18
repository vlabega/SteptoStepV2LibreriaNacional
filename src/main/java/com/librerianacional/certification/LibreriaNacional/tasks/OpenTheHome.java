package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalAccountPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheHome implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public OpenTheHome(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// actor.attemptsTo(Click.on(LibreriaNacionalAccountPage.LIBRERIANACIONAL_HOMELINK));
		System.out.println("Sigue el Browser Abierto");
		System.out.println("El usuario seleciona la opcion Libros");
		actor.attemptsTo(Click.on(LibreriaNacionalAccountPage.LIBRERIANACIIONAL_LINKBOOKS));
	}

	public static OpenTheHome go(PageObject page) {
		return instrumented(OpenTheHome.class, page);
	}

}
