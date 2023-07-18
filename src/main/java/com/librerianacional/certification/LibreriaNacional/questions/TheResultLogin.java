package com.librerianacional.certification.LibreriaNacional.questions;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalAccountPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

//implementamos la interfaz questions
//Si deferencian de los Task por que devuelven un elemento
//Question <ANSWER> este es del tipo de lo que recivo
//importo el Question
//implemento el metodo The result

public class TheResultLogin implements Question<String> {

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
		return (Text.of(LibreriaNacionalAccountPage.LIBRERIANACIONAL_LABELTEXT).answeredBy(actor).toString());
	}

	public static TheResultLogin is() {
		// TODO Auto-generated method stub
		return new TheResultLogin();
	}

}
