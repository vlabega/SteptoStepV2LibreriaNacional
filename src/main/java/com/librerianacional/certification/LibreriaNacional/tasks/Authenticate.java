package com.librerianacional.certification.LibreriaNacional.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.librerianacional.certification.LibreriaNacional.models.User;
import com.librerianacional.certification.LibreriaNacional.userinterfaces.LibreriaNacionalLoginPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Authenticate implements Task {

	public static List<String> LoginList = new ArrayList<String>();

	public Authenticate(List<String> LoginList) {
		Authenticate.LoginList = LoginList;
	}

	private User user;

	public Authenticate(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("copia los datos para autenticar");
		actor.attemptsTo(Enter.theValue(user.getUsername()).into(LibreriaNacionalLoginPage.LIBRERIANACIONAL_USER),
				Enter.theValue(user.getPassword()).into(LibreriaNacionalLoginPage.LIBRERIANACIONAL_PASSWORD));
		System.out.println("Seleccionar Iniciar Sesion");
		actor.attemptsTo(Click.on(LibreriaNacionalLoginPage.LIBRERIANACIONAL_SUBMIT));
	}

	public static Authenticate withThe(List<String> LoginList) {
		System.out.println("Imprimir Lista");
		System.out.println(Arrays.toString(LoginList.toArray()));

		User user = new User(LoginList.get(0), LoginList.get(1));
		return instrumented(Authenticate.class, user);
	}

}
