package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Desafio;
import src.brackets_rotation;

public class testDesafio {

	@Test
	public void test1() {

		String S = ")()()("; 

		Desafio desafio = new Desafio();
		int resultado = desafio.solucao(S, 3);

		assertEquals(0, resultado);
	}
	
	
	@Test
	public void test2() {

		String S = ")()()(";

		Desafio desafio = new Desafio();
		int resultado = desafio.solucao(S, 3);

		assertEquals(0, resultado);
	}
	
	@Test
	public void test3() {

		String S = ")()()(";

		Desafio desafio = new Desafio();
		int resultado = desafio.solucao(S, 3);

		assertEquals(0, resultado);
	}

}
