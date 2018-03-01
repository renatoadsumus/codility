package src;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {

		// Test Array {1, 3, 6, 4, 1, 2}
		int[] myListA = { 1, 3, 6, 4, 1, 2 };
		solution(myListA);		
		// Test Array {1, 3, 6, 4, 1, 2}
		int[] myListB = { 1, 2, 3 };
		solution(myListB);
		
		int[] myListC = { -1, -2 };
		solution(myListC);
		
		int[] myListD = { 2, 7, 9 };
		solution(myListD);

	}

	public static int solution(int[] A) {
		int maior = A[0];
		int menor = A[0];
		int menorValorInteiroNaoExistenteNoArray = 1;
		
		for (int i = 0; i < A.length; i++) {		

			if (maior < A[i]) {
				maior = A[i];
			}

			if (menor > A[i]) {
				menor = A[i];
			}
		}
		
		boolean existe = false;
		
		for (int i = menor; i < maior; i++) {

			if (!verificarExisteNoArray(A, i)) {

				existe = true;
				menorValorInteiroNaoExistenteNoArray = i;
			} 	
		}
		
		if(!existe)
			menorValorInteiroNaoExistenteNoArray = maior + 1;
		
		if(maior < 0)
			menorValorInteiroNaoExistenteNoArray = 1;
		
			
		System.out.println(menorValorInteiroNaoExistenteNoArray);

		return menorValorInteiroNaoExistenteNoArray;
	}

	private static boolean verificarExisteNoArray(int[] A, int num) {

		boolean existe = false;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == num) {

				existe = true;
			}
		}

		return existe;
	}

}
