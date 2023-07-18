package com.librerianacional.certification.LibreriaNacional.models;

public class User {
	// Clase para envio y captura del login y Password desde el Feature
	private String username;
	private String password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}
