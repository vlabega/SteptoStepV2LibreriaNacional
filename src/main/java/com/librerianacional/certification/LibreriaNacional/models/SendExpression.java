package com.librerianacional.certification.LibreriaNacional.models;

public class SendExpression {

	//Atributos. // Cambiarlos por string para un step reutilizable
		private String word;
		
		public SendExpression(String word) {
			this.word = word;
		}
//gets

		public String getWord() {
			System.out.println("buscar la cancion en la variable Word");
			return word;
		}
		
}
