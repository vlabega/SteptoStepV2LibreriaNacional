package com.librerianacional.certification.LibreriaNacional.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class PrintList implements Task {

	public static List<String> rList = new ArrayList<String>();

	public PrintList(List<String> rList) {
		PrintList.rList = rList;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		int numElementos = rList.size();
		System.out.println("Numero de elementos del ArrayList: " + numElementos);
		System.out.println("Imprimir La lista");
		System.out.println("--------------------------------------------------");
		System.out.println(rList);
	}

	public static PrintList Print(List<String> rList) {
		return instrumented(PrintList.class, rList);
	}
}
