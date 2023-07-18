package com.librerianacional.certification.LibreriaNacional.utils;

import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleAppsComponent;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.GoogleTranslatePage;

import net.serenitybdd.screenplay.targets.Target;

@SuppressWarnings("unused")
public class StringToTarget {
	
	public static Target getSourceLanguage(String sourceLanguage) {
		
		switch (sourceLanguage) {
		
		case "Inglés": 
			return GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH;
		case "English": 
			return GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH;
		default: 
			return GoogleTranslatePage.SOURCE_LANGUAGE_ENGLISH;
			
		}			
		
	}

	
public static Target getTargetLanguage(String targetLanguage) {
		
		switch (targetLanguage) {
		
		case "Español": 
			return GoogleTranslatePage.TARGET_LANGUAGE_SPANISH;
		case "Spanish": 
			return GoogleTranslatePage.TARGET_LANGUAGE_SPANISH;
		default: 
			return GoogleTranslatePage.TARGET_LANGUAGE_SPANISH;
			
		}			
		
	}
	
	
}


