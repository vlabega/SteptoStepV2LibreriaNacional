package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.librerianacional.com")
public class LibreriaNacionalHomePage extends PageObject {

	public static final Target LIBRERIANACIONAL_LOGO = Target.the("librerianacional logo").located(By.name("buscar"));
	public static final Target LIBRERIANACIONAL_HEADBAR = Target.the("librerianacional head bar")
			.locatedBy("//div[@class='col-md-6 d-flex justify-content-end']");

	public static final Target LIBRERIANACIONAL_MICUENTA = Target.the("librerianacional micuenta button")
			.locatedBy("//header//button[@id='dropdownMenuLogin'] ");
	public static final Target LIBRERIANACIONAL_BEGIN_SESION = Target.the("librerianacional begin Sesion button")
			.locatedBy(
					"//div[@class='dropdown-menu dropdown-menu-right dropdown-menu-login m-0 bg-white border-radius-0 px-3 show']//a[1]");

}
