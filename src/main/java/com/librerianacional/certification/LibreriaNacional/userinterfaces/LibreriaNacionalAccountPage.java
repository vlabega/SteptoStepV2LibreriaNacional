package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LibreriaNacionalAccountPage extends PageObject {

	public static final Target LIBRERIANACIONAL_ACCOUNTLOGO = Target.the("librerianacional account logo").locatedBy(
			"/html[1]/body[1]/app-root[1]/div[1]/app-mi-cuenta[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/img[1]");
	
	public static final Target LIBRERIANACIONAL_HOMELINK = Target.the("librerianacional account logo")
			.locatedBy("//img[@src='assets/images/libreria-nacional-logo-rwd.png']");

	public static final Target LIBRERIANACIIONAL_LINKBOOKS = Target.the("libreria nacional link books").locatedBy(
			"//a[@class='text-white text--upper text--xm text--megabold link-menu'][contains(text(),'LIBROS')]");

	public static final Target LIBRERIANACIIONAL_LINKCLOSE = Target.the("libreria nacional link close")
			.locatedBy("/html/body/app-root/div/app-mi-cuenta/div[2]/div/div/div[1]/div/div/div[2]/div/li[7]/a");

	public static final Target LIBRERIANACIONAL_LABELTEXT = Target.the("librerianacional Label text").locatedBy(
			"/html[1]/body[1]/app-root[1]/div[1]/app-mi-cuenta[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]");
}
