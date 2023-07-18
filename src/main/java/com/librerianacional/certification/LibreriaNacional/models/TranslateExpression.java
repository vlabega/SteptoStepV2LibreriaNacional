package com.librerianacional.certification.LibreriaNacional.models;

//import net.serenitybdd.screenplay.targets.Target;

public class TranslateExpression {
    //Atributos. // Cambiarlos por string para un step reutilizable
	private  String sourceLanguage;
	private  String targetLanguage;
	private  String word;
	
	public TranslateExpression(String sourceLanguage, String targetLanguage, String word) {
		this.sourceLanguage = sourceLanguage;
		this.targetLanguage = targetLanguage;
		this.word = word;
	}

	//get.
	public  String getSourceLanguage() {
		return sourceLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

	public  String getWord() {
		return word;
	} 
	
}

