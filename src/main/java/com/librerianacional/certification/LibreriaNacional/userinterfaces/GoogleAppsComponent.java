package com.librerianacional.certification.LibreriaNacional.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;


public class GoogleAppsComponent {

	public static final Target GOOGLE_APPS = Target.the("google apps button").locatedBy("//*[@id='gbwa']/div[1]/a");
	// li[@id='ogbkddg:3']
	// a[@id='gb51']//span[@class='gb_k']
	// a[@id='gb51']//span[@class='gb_k']
	// ublic static final Target GOOGLE_APPS = Target.the("google apps
	// button").locatedBy("//a[@id='gb51']//span[@class='gb_k']");


	//public static final Target GOOGLE_TRANSLATE = Target.the("google transalate button").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[8]/a/div/span");
	//public static final Target GOOGLE_TRANSLATE = Target.the("google translate button").locatedBy("//span[contains(text(),'Traductor')]");
	//public static final Target GOOGLE_TRANSLATE = Target.the("google translate button").locatedBy("//*[@id=\"gb51\"]/span[1]");
	public static final Target GOOGLE_TRANSLATE = Target.the("google transalate button").locatedBy("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div[2]/div[2]/div[1]/ul/li[13]/a/div/span");

	
	
	
	public static final Target GOOGLE_YOUTUBE = Target.the("google youtube button")
			.locatedBy("//*[@id=\"gb36\"]/span[1]");

}
