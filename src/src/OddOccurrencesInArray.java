package src;

import java.util.ArrayList;

public class OddOccurrencesInArray {

	public static void main(String[] args) {

		int[] myListA = { 9, 3, 9, 3, 9, 7, 9 };

		System.out.println(solution(myListA));

	}

	public static int solution(int A[]) {

		int unpaired = 0;

		ArrayList<Integer> arl = new ArrayList<Integer>();

		int posicao_returno = 0;

		for (int i = 0; i < A.length - 1; i++) {

			posicao_returno = return_position(A[i], A, i + 1);

			if (posicao_returno != 0 && !arl.contains(A[i])) {
				arl.add(A[i]);
				arl.add(A[posicao_returno]);
			}

		}

		for (int i = 0; i < A.length; i++) {

			if (!arl.contains(A[i]))
				unpaired = A[i];
		}

		return unpaired;

	}

	public static int return_position(int N, int A[], int qualposicao) {
		int position = 0;

		for (int j = qualposicao; j < A.length; j++) {

			if (N == A[j]) {

				position = j;
				break;
			}

		}
		return position;

	}
}
