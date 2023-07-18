package com.librerianacional.certification.LibreriaNacional.questions;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalSearchHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResultAccountPage implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

		System.out.println("La Cuenta del Usuario es la logeada");
		// String textResult =
		// Text.of(LibreriaNacionalAccountPage.LIBRERIANACIIONAL_LABELTEXT).viewedBy(actor).asString();
		// System.out.println(textResult);

		/*
		 * if (textResult.equals("Hola, Vladimir!")) { System.out.println("OK"); } else
		 * { System.out.println("No OK"); }
		 */
		// return textResult;
		return (Text.of(LibreriaNacionalSearchHomePage.LIBRERIANACIONAL_RESULTTEXT).answeredBy(actor).toString());
	}

	public static TheResultAccountPage is() {
		return new TheResultAccountPage();
	}

}
