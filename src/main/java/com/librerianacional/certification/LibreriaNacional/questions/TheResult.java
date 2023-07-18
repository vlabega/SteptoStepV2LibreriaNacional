package com.librerianacional.certification.LibreriaNacional.questions;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

//implementamos la interfaz questions
//Si deferencian de los Task por que devuelven un elemento
//Question <ANSWER> este es del tipo de lo que recivo
//importo el Question
//implemento el metodo The result

public class TheResult implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// capturar el valor resultado.

		System.out.println("La palabra a Traducir y traducida es");
		String textResult = Text.of(GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA).answeredBy(actor).toString();
		System.out.println(textResult);
		// lobo es un animal

		if (textResult.equals("lobo es un animal")) {
			System.out.println("OK");
		} else {
			System.out.println("No OK");
		}

		return textResult;

	}

	public static TheResult is() {
		// TODO Auto-generated method stub
		return new TheResult();
	}


}
