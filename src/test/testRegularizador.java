package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import modelo.enums.Regularizador;

class testRegularizador {

	@Test
	void test() {
		assertTrue(Pattern.matches(Regularizador.Nombre.getCadena(), "Francisco Manuel"));
		assertTrue(Pattern.matches(Regularizador.Id.getCadena(), "2"));
		assertTrue(Pattern.matches(Regularizador.Apellido.getCadena(), "Delgado Garcia"));
		assertTrue(Pattern.matches(Regularizador.Telefono.getCadena(), "678549821"));
		assertTrue(Pattern.matches(Regularizador.Direccion.getCadena(), "C/ Puerto Real 12º"));
		assertTrue(Pattern.matches(Regularizador.Nacimiento.getCadena(), "31/12/1999"));
	}

}
