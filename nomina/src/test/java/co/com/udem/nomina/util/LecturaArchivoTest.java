package co.com.udem.nomina.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LecturaArchivoTest {
	private final LecturaArchivo lecturaArchivo = new LecturaArchivo();
	@Test
	public void leerArchivo() {
		String lectura = lecturaArchivo.leerArchivo();
		assertEquals("", lectura);
	}
	

	
}
