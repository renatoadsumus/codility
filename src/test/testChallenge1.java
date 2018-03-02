package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Challenge1;
import src.Desafio2;
import src.brackets_rotation;

public class testChallenge1 {

	@Test
	public void testFourWords() {

		String S = "We test coders. Give us a try?"; 

		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(4, resultado);
	}
	
	
	@Test
	public void testTwoWords() {

		String S = "Forget  CVs..Save time . x x";

		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(2, resultado);
	}
	
	@Test
	public void testThreerWords() {

		String S = "Tomorow I want. car. free time";
		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(3, resultado);
	}
	
	
	@Test
	public void testSevenrWordsWithQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play";
		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(7, resultado);
	}
	
	
	@Test
	public void testSevenrWordsWithTwoQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play. ok?";
		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(7, resultado);
	}
	
	@Test
	public void testNineWordsWithTwoQuestionMark() {

		String S = "Tomorow I want. car. free time? And after the trip I want play. ok? Paul you are so pretty boy and so smart";
		Challenge1 desafio = new Challenge1();
		int resultado = desafio.solution(S);

		assertEquals(9, resultado);
	}

}
