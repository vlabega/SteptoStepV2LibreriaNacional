package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LibreriaNacionalLoginOptionPage extends PageObject {

	public static final Target BEGIN_SESION = Target.the("begin Sesion button").locatedBy(
			//"//a[@href='#/usuario/iniciar-sesion']//div[@class='d-flex justify-content-between align-content-center border px-2 px-md-3 py-3 shadow-bx']//div[@class='d-flex align-items-center text--blue text--normal text--xl my-1']");
			"//a[@href='/usuario/iniciar-sesion']//div[@class='d-flex justify-content-between align-content-center border px-2 px-md-3 py-3 shadow-bx']");
}
