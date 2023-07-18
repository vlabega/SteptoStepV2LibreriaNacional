package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LibreriaNacionalSearchHomePage extends PageObject {

	public static final Target LIBRERIANACIONAL_SEARCHTEXT = Target.the("librerianacional search text").locatedBy(
			"/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/div[2]/input[2]");

	public static final Target LIBRERIANACIONAL_RESULTTEXT = Target.the("librerianacional result text").locatedBy(
			"/html/body/app-root/div/app-libros/div[2]/div/div/div/div/h4");

	public static final Target LIBRERIANACIONAL_ACCOUNT = Target.the("librerianacional Account").locatedBy(
			"/html[1]/body[1]/app-root[1]/app-header[1]/header[1]/div[2]/div[1]/div[1]/div[2]/div[1]/menu-login-header[1]/div[1]/div[1]/div[1]/a[1]");
}
