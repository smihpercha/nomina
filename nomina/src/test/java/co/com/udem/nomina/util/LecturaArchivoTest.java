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
	
	@Test
	public void leerRegistro() {
		String registro = "duban,perea chaverra,1077440737,ingeniero,5000000";
		lecturaArchivo.leerRegistro(registro);
		assertEquals("loli,perea chaverra,35897001,coordinadora,3000000", registro);
	}
	
}
