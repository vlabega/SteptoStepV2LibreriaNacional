package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LibreriaNacionalLoginPage extends PageObject{

	public static final Target LIBRERIANACIONAL_USER = Target.the("librerianacional user")
			.located(By.name("usuario"));
	public static final Target LIBRERIANACIONAL_PASSWORD = Target.the("librerianacional password")
			.located(By.name("contrasena"));
	public static final Target LIBRERIANACIONAL_SUBMIT = Target.the("librerianacional button submit").locatedBy(
			"/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[1]/div[2]/app-iniciar-sesion[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/button[1]");

}
