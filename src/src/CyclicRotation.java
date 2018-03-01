package src;

public class CyclicRotation {

	public static void main(String[] args) {

		int[] myListA = { 3, 8, 9, 7, 6 };

		// [6, 3, 8, 9, 7] - Uma vez
		// [7, 6, 3, 8, 9] - Duas Vezes
		// [9, 7, 6, 3, 8] - Tres Vezes
		
		solution(myListA, 3);

	}

	public static int[] solution(int[] A, int K) {
		
		int[] result = A;
		
		int[] resultTemp = new int[A.length];

		for (int i = 0; i < K; i++) {
			
			resultTemp = returnNewArray(result);
			result = resultTemp;
			
		}

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i]);
		}
		
		return result;

	}

	public static int[] returnNewArray(int[] A) {

		int[] result = new int[A.length];

		//Recebe o Ultmio
		result[0] = A[A.length - 1];

		for (int j = 1; j < A.length; j++) {

			result[j] = A[j - 1];
		}
		

		return result;
	}

}
