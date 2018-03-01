package src;

public class PermCheck {

	public static void main(String[] args) {

		// Test Array {1, 3, 6, 4, 1, 2}
		// permutation

		// Com Permuta - Espera UM
		int[] myListA = { 4, 1, 3, 2 };

		// Sem Permuta - Espera ZERO
		int[] myListB = { 15, 7, 3, 6, 8, 1 };

		// Numeros Iguais - Espera ZERO
		int[] myListC = { 3, 2, 3, 1 };
		
		int[] myListD = { 6, 8, 7, 9 };

		System.out.println(solucao(myListD));
	}

	public static int solution2(int[] A) {
		int cont1, cont2, aux, atual, next = 0;
		int permutation = 1;
		boolean first = true;

		for (cont1 = 0; cont1 < A.length; cont1++) {

			for (cont2 = 0; cont2 < A.length - 1; cont2++) {

				if (A[cont2] < A[cont2 + 1]) {

					aux = A[cont2];
					A[cont2] = A[cont2 + 1];
					A[cont2 + 1] = aux;

				}
			}

			atual = A[cont1];
			// System.out.println("Maior Valor da Rodada:"+ atual);

			if (first) {
				next = atual - 1;
				first = false;
			} else {

				if (atual != next) {
					permutation = 0;
					break;
				}

				next--;

			}

		}

		// for (int y = 0; y < elementos.length; y++) {
		// System.out.println("Ordenado.." +elementos[y]);
		// }

		return permutation;

	}

	public static int acharMenor(int[] A) {

		int menor = A[0];

		for (int i = 0; i < A.length; i++) {

			if (menor > A[i]) {
				menor = A[i];
				System.out.println(menor);
			}

		}

		return menor;
	}

	public static int solucao(int[] A) {
		
		//{ 4, 1, 3, 2 }
		
		int[] contador = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			
			if (A[i] < 1 || A[i] > A.length) {
				
				return 0;
			} else if (contador[A[i] - 1] == 1) {
				
				return 0;
			} else {
				
				contador[A[i] - 1] = 1;
			}
		}
		return 1;
	}

}
