package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalSearchHomePage;
import com.librerianacional.certification.LibreriaNacional.utils.PrintList;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchBook implements Task {

	static List<String> bookslist;

	public SearchBook(List<String> bookslist) {
		SearchBook.bookslist = bookslist;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(PrintList.Print(bookslist));

		System.out.println("Ingresa al proceso de busqueda del Libro");

		Integer list;
		for (list = 1; list < bookslist.size(); list++) {

			String product;

			System.out.println("Ingresa a recorrer los Libros");

			product = (bookslist.get(list));
			System.out.println("Este es el producto a buscar: " + product);
			System.out.println("Click en el box para buscar");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			actor.attemptsTo(Click.on(LibreriaNacionalSearchHomePage.LIBRERIANACIONAL_SEARCHTEXT));
			System.out.println("Escribe el producto en el box buscar");
			actor.attemptsTo(Enter.theValue(product).into(LibreriaNacionalSearchHomePage.LIBRERIANACIONAL_SEARCHTEXT));
			
			
			BrowseTheWeb.as(actor).getDriver().findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]"))
			.sendKeys(Keys.ENTER); 
			
			
			//System.out.println("Inicia el proceso de Seleccion de productos");
			//actor.attemptsTo(SelectedBook.the(new SelectedBook(product)));

		}

	}

	public static SearchBook in(List<String> books) {
		return instrumented(SearchBook.class, books);
	}

}
