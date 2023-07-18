package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.librerianacional.certification.LibreriaNacional.models.SelectedOption;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleAppsComponent;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoTo implements Task {

	@SuppressWarnings("unused")
	private Target googleApp;
	// secambia para string
	@SuppressWarnings("unused")
	private SelectedOption selectedOption;

	public GoTo(Target googleApp) {
		this.googleApp = googleApp;
	}

	public GoTo(SelectedOption selectedOption) {
		this.selectedOption = selectedOption;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_APPS));
		
		try {
		    // Espera durante 5 segundos
		    Thread.sleep(20000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		actor.attemptsTo(Click.on(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	public static GoTo theApp(Target googleTranslate) {
		return instrumented(GoTo.class, googleTranslate);
	}

	// Actualizar metodo para que reciba lo que viene de selectionOption
	// public static GoTo theApp(SelectedOption selectedOption) {
	// return instrumented(GoTo.class, selectedOption);
	// }

}
