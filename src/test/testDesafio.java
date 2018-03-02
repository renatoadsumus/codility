package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Desafio;
import src.Desafio2;
import src.brackets_rotation;

public class testDesafio {

	@Test
	public void testFourWords() {

		String S = "We test coders. Give us a try?"; 

		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(4, resultado);
	}
	
	
	@Test
	public void testTwoWords() {

		String S = "Forget  CVs..Save time . x x";

		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(2, resultado);
	}
	
	@Test
	public void testThreerWords() {

		String S = "Tomorow I want. car. free time";
		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(3, resultado);
	}
	
	
	@Test
	public void testSevenrWordsWithQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play";
		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(7, resultado);
	}
	
	
	@Test
	public void testSevenrWordsWithTwoQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play. ok?";
		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(7, resultado);
	}
	
	@Test
	public void testNineWordsWithTwoQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play. ok? Paul you are so pretty boy and so smart";
		Desafio desafio = new Desafio();
		int resultado = desafio.solution(S);

		assertEquals(9, resultado);
	}

}
