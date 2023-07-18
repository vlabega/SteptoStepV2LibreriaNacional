package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.librerianacional.certification.LibreriaNacional.models.TranslateExpression;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleTranslatePage;
import com.librerianacional.certification.LibreriaNacional.utils.StringToTarget;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

//implementar la clase 
@SuppressWarnings("unused")
public class TraslateTask implements Task {
	// los actualizo por atributos de clase encapsularlos
	// Se actualizan por:
	// private Target sourceLanguage;
	// private Target targetLanguage;
	// private String word;
	// Se actualiza por:
	private TranslateExpression translateExpression;

	// Construit los constructores inicializar los atributos(Construir el
	// objeto)/enviarle los atributos.
	public TraslateTask(TranslateExpression translateExpression) {

		// this.sourceLanguage = sourceLanguageEnglish;
		// this.targetLanguage = targetLanguageSpanish;
		// this.word = word;

		// se cambia por:
		this.translateExpression = translateExpression;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		// Estos son las acciones del usuario en la pagina, interacciones
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		System.out.println("buscar la palabra y la devuelve por el metodo Get");
		actor.attemptsTo(
				Enter.theValue(translateExpression.getWord()).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));

		
		
		
		//actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_BUTTON));
		// actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH)); //

		//actor.attemptsTo(Click.on(StringToTarget.getSourceLanguage(translateExpression.getSourceLanguage()))); //
		//actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_BUTTON));
		// actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_SPANISH)); //
		//actor.attemptsTo(Click.on(StringToTarget.getTargetLanguage(translateExpression.getTargetLanguage()))); //

		// Digitar la palabra

		// actor.attemptsTo(Enter.theValue("Save").into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		// //
		//System.out.println("buscar la cancion y la devuelve por el metodo Get");
		//actor.attemptsTo(
		//		Enter.theValue(translateExpression.getWord()).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		System.out.println("Selecciona Traducir");
		//actor.attemptsTo(Click.on(GoogleTranslatePage.TRASLATE_BUTTON));

	}

	public static TraslateTask the(TranslateExpression translateExpression) {
		// TODO Auto-generated method stub
		return instrumented(TraslateTask.class, translateExpression);
	}

}
