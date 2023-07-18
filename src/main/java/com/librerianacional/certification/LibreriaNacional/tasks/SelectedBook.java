package com.librerianacional.certification.LibreriaNacional.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SelectedBook implements Task {

	static String product;

	public SelectedBook(String product) {
		System.out.println(product);
		SelectedBook.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Seleccionar Producto:" + product);
	}

	public static SelectedBook the(SelectedBook selectedbook) {
		return new SelectedBook(product);
	}

}
