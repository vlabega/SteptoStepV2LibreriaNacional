package com.librerianacional.certification.LibreriaNacional.userinterfaces;

//import java.lang.annotation.Target;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;



@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {
	// Mapear los objetos.
	public static final Target GOOGLE_LOGO = Target.the("google logo").located(By.id("hplogo"));
	public static final Target GOOGLE_TEXT = Target.the("google text").located(By.name("q"));
	// input[@title='Buscar']
	public static final Target GOOGLE_SEARCH = Target.the("google search").located(By.name("btnK"));
	// div[@class='FPdoLc VlcLAe']//input[@value='Buscar con Google']
}
