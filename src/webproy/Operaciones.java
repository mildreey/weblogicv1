package webproy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Operaciones {


	@Test
	public void numeroPar() {
		int numero = 4;
		assertTrue(numero%2 == 0);	
	}
	@Test
	public void suma() {
		int a=10;
		int b= 8;
		assertTrue(a+b ==18);
	}
	@Test
    public void resta() {
		int a=10;
		int b= 8;
		assertTrue(a-b == 2);
    }

	 	
}
