package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	private PageObject page;

	// Cobstructor para asignar un valor inicializar el valor del PageObject
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Open.browserOn(page));
		

	}

	public static OpenTheBrowser at(PageObject page) {

		return instrumented(OpenTheBrowser.class, page);

	}

}
