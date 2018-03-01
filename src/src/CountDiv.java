package src;

public class CountDiv {

	public static void main(String[] args) {

		// Precisa Retornar 3
		// System.out.println(solution(6, 11, 2));
		// Precisa Retornar 7
		//System.out.println(solution(7, 27, 3));
		//System.out.println(solution(6, 10, 2));
		System.out.println(solution(6, 19, 2));
	}

	public static int solution(int A, int B, int K) {

		// For example, for A = 6, B = 11 and K = 2, your function should return
		// 3,
		// because there are three numbers divisible by 2 within the range
		// [6..11], namely 6, 8 and 10.
		// A and B are integers within the range [0..2,000,000,000];

		int count = 0;

		if (A % 2 == 0 && B % 2 == 0 && K % 2 == 0) {

			A = A / 2;
			B = B / 2;
			K = K / 2;			
		}	


		count = obterValor(A, B, K);

		return count;
	}

	public static int obterValor(int A, int B, int K) {

		int count = 0;
		while (A <= B) {

			if (A % K == 0) {
				count++;
				A = A + K;

			} else {
				A++;
			}
		}

		return count;
	}

}
