package src;

public class LongestNonnegativeSumSlice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * For example, given A = [−1, −1, 1, −1, 1, 0, 1, −1, −1], your
		 * function should return 7, as the slice starting at the second
		 * position and ending at the eighth is the longest slice with a
		 * non-negative sum.
		 * 
		 * For another example, given A = [1, 1, −1, −1, −1, −1, −1, 1, 1] your
		 * function should return 4: both the first four elements and the last
		 * four elements of array A are longest valid slices.
		 */

		int[] A = { -1, -1, 1, -1, 1, 0, 1, -1, -1 };
		int[] B = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		// int[] A = { -1, 1, 0, };
		solution(B);

	}

	public static int solution(int[] A) {
		int maior = 0;
		int atual;

		for (int i = 0; i < A.length - 1; i++) {

			if (A[i] >= -1 || A[i] < 2) {

				atual = obterMaximoSlice(A, i);

				if (atual > maior)
					maior = atual;
			} else {
				return maior;
			}

		}

		System.out.println("Maior Slice " + maior);

		return maior;

	}

	public static int obterMaximoSlice(int[] A, int posicao) {
		int count = 1;
		int aux = A[posicao];
		int maior = 0;

		for (int i = posicao + 1; i < A.length; i++) {

			count++;
			if (aux + A[i] >= 0) {
				// System.out.println(count);
				maior = count;

			}
			aux = aux + A[i];

		}

		return maior;
	}
}
