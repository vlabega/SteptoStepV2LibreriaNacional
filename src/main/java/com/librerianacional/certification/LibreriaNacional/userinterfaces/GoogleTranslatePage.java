package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	// Elementos de pagina para interactuar...
	// Satic la clase accede directamente al atributo.
	// public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("source
	// language button")
	// .located(By.id("gt-sl-gms"));
	public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("source language button")
			.locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
	// public static final Target TARGET_LANGUAGE_BUTTON = Target.the("target
	// language button")
	// .located(By.id("gt-tl-gms"));
	public static final Target TARGET_LANGUAGE_BUTTON = Target.the("target language button")
			.locatedBy("//div[@class='tl-more tlid-open-target-language-list']");

	
	// public static final Target SOURCE_LANGUAGE_ENGLISH =
	// Target.the("source language option
	// english").locatedBy("//*[@id=\"gt-sl-gms-menu\"]//div[contains(text(),'inglés')]");
	public static final Target SOURCE_LANGUAGE_ENGLISH = Target.the("source language option english")
			.locatedBy("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]");
	// public static final Target TARGET_LANGUAGE_SPANISH =
	// Target.the("target language option
	// spanish").locatedBy("//*[@id='gt-tl-gms-menu']//div[contains(text(),'español')]");
	public static final Target TARGET_LANGUAGE_SPANISH = Target.the("target language option spanish")
			.locatedBy("/html/body/div[2]/div[4]/div/div[2]/div[2]/div[2]/div/div[2]/div[30]/div[2]");
	
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("source language text area")
			.located(By.id("source"));

	public static final Target TRASLATE_BUTTON = Target.the("traslate button").located(By.id("gt-submit"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("target language text area")
			.locatedBy("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]");
	
	// TASK hacen los Click , enter, Hit, etx - Question hacen leen el valor
												// read veryfied, Asserts

	// *[@id="gt-sl-gms-menu"]/table/tbody/tr/td//div[contains(text(),'Inglés')]
	// *[@id="gt-sl-gms-menu"]//div[contains(text(),'Inglés')]
	// *[@id='gt-sl-gms-menu']//div[contains(text(),'Inglés')]
	// *[@id="search-container"]/div/div

}
