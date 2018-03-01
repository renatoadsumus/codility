package src;

import java.util.ArrayList;

public class PermMissingElem {

	public static void main(String[] args) {

		// Test Array {1, 3, 6, 4, 1, 2}
		int[] myListA = { 1, 3, 5, 2 };
		solution2(myListA);

	}

	public static int solution2(int[] A) {

		int missed = 1;

		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {

				if (A[j] == missed) {
					missed++;
					break;
				}

			}
		}

		System.out.println(missed);

		return missed;
	}

	public static boolean retornarNaoEncontado(int[] A, int num) {
		boolean exists = false;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == num)
			{
				exists = true;
			}
		}

		return exists;
	}

	public static int solution(int[] A) {

		ArrayList<Integer> arl = new ArrayList<Integer>();

		int maior = A[0];
		int menor = A[0];
		int missed = 0;

		for (int i = 0; i < A.length; i++) {

			if (maior < A[i])
				maior = A[i];

			if (menor > A[i])
				menor = A[i];

			arl.add(A[i]);
		}

		for (int i = menor; i < maior; i++) {

			if (!arl.contains(i))
				missed = i;
		}

		return missed;

	}

}
