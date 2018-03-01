package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import src.brackets_rotation;

public class testBrackets_rotation {

	@Test
	public void testIniciandoETerminando() {

		String S = ")()()("; // k=3 Retorna 6 // -2 FALHA

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 3);

		assertEquals(6, resultado);
	}

	@Test
	public void testTodosIguais() {

		String S = "(((())))"; // k=3 Retorna 6 // -2 FALHA

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 0);

		assertEquals(8, resultado);
	}

	@Test
	public void testMeioAMeioDiferentess() {

		String S = ")))((("; // k=3 Retorna 6 // -2 FALHA

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 4);

		assertEquals(6, resultado);
	}

	@Test
	public void test5ComK_IgualZeroComAbertoMaiorQueFechadoNoWhile() {

		String S = "()))((()"; // k=3 Retorna 6

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 0);

		assertEquals(4, resultado);
	}

	@Test
	public void test5ComK_IgualZeroComFechadoMaiorQueAbertoNoWhile() {

		String S = "()))((((()"; // k=3 Retorna 6

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 0);

		assertEquals(4, resultado);
	}

	@Test
	public void test6PassandoKZeroComAbertoIgualFechadoNoWhile() {

		String S = "()))(())"; // k=3 Retorna 6

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 0);

		assertEquals(6, resultado);
	}

	@Test
	public void test6PassandoKZeroComMaisFechadoQueAbertoNoWhile() {

		String S = "()))((())))"; // k=3 Retorna 6

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 0);

		assertEquals(8, resultado);
	}

	@Test
	public void test6PassandoKMaiorZeroComMaisFechadoQueAbertoNoWhile() {

		String S = "()))((())))"; // k=3 Retorna 6

		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 1);

		assertEquals(10, resultado);
	}

	@Test
	public void test() {
		String S = "(())))";
		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 1);

		assertEquals(6, resultado);

	}

	@Test
	public void test1() {
		String S = "((()(((";
		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 3);

		assertEquals(6, resultado);

	}

	@Test
	public void test2() {
		String S = "()(()";
		brackets_rotation classe = new brackets_rotation();
		int resultado = classe.solucao5(S, 1);

		assertEquals(4, resultado);
	}

}
