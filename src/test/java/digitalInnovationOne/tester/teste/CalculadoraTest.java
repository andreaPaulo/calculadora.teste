package digitalInnovationOne.tester.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma=  calc.somar("5+3+2");
		assertEquals(10, soma);
	}

}
