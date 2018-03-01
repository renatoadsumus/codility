package src;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Distinct {

	public static void main(String[] args) {

		/*
		 * For example, given array A consisting of six elements such that:
		 * 
		 * A[0] = 2 A[1] = 1 A[2] = 1 A[3] = 2 A[4] = 3 A[5] = 1 the function
		 * should return 3, because there are 3 distinct values appearing in
		 * array A, namely 1, 2 and 3.
		 */

		int[] A = { 2, 1, 1, 2, 3, 1 };

	}

	public static int solution(int[] A) {
		
		
		
		return 0;

	}

	public static boolean existeValor(int[] A, int valor) {

		boolean existe = false;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == valor) {
				existe = true;
				break;
			}

		}

		return existe;
	}
}
