package com.librerianacional.certification.LibreriaNacional.interactions;

import java.util.List;

import com.librerianacional.certification.LibreriaNacional.tasks.SearchBook;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

@SuppressWarnings("unused")
public class DeleteFirstElementList implements Task{

	static List<String> bookslist;

	public DeleteFirstElementList(List<String> bookslist) {
		DeleteFirstElementList.bookslist = bookslist;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		System.out.println(bookslist.size());
		int longitud = bookslist.size();	

		//Lectura uno a uno.
		Integer i;
		 
		for (i=0;i<bookslist.size();i++){
		 
		  System.out.println(bookslist.get(i));
		 
		}
		
	}
	
}
