package Test;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

import org.junit.Test;

public class TestGroup {
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void getOnAnEmptyListThrowsException() {
		List<Object> l = new ArrayList<Object>();
		e.expect(IndexOutOfBoundsException.class);
		e.expectMessage("Index: 0, Size: 0");
		l.get(0); // Throws exception
	}
	
	@Test
	public void testCallPolice() {
		boolean expected = false; 
		boolean actual = true;
		
		
		assertEquals("Botón activado", expected, actual);
	}
}

/*
 * callPolice()
 * Primero espera 15 segundos
 * Tras esos 15 segundos, si no se ha cancelado, hace:
 * Llama al 112
 * Empieza a sonar una alarma en el movil
 * Empieza a grabar
 */
