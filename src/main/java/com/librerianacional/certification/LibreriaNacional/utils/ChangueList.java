package com.librerianacional.certification.LibreriaNacional.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class ChangueList implements Task {

	public static List<String> rList = new ArrayList<String>();

	public ChangueList(List<String> rList) {
		PrintList.rList = rList;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(PrintList.Print(rList));

		rList.set(0, "vlabega@gmail.com");
		rList.set(1, "1234zzzz");
		
		actor.attemptsTo(PrintList.Print(rList));

	}

	public static ChangueList Print(List<String> rList) {
		return instrumented(ChangueList.class, rList);
	}
}