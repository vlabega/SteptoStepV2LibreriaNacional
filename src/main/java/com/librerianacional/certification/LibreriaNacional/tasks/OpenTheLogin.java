package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalLoginOptionPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class OpenTheLogin implements Task {

	@SuppressWarnings("unused")
	private PageObject page;

	public OpenTheLogin(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Selecciona opcion Ingresar con mail y contraseña");
		actor.attemptsTo(Click.on(LibreriaNacionalLoginOptionPage.BEGIN_SESION));
	}

	public static OpenTheLogin at(PageObject page) {
		return instrumented(OpenTheLogin.class, page);
	}

}
