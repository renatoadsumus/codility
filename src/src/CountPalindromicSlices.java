package src;

public class CountPalindromicSlices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "aza";
		// S = "aba";
		// S = "baa";
		// S = "abacaba";
		// S = "zaza";
		// S = "aaa";
		S = "caabbbaa";
		// For example, for string S = baababa the function should return 6,
		// because exactly six of its slices are palindromic; namely: (0, 3),
		// (1, 2), (2, 4), (2, 6), (3, 5), (4, 6).

		// These strings are not palindromes:
		// https://app.codility.com/programmers/task/count_palindromic_slices/
		// S= "abbacada";
		solucao2(S);

		// StringBuilder sb = new StringBuilder(S);
		// String newWord = "";

		// sb.deleteCharAt(0);
		// newWord = sb.toString();

		// System.out.println("Nova Palavra..: " + newWord);

	}

	public static int solucao2(String S) {

		StringBuilder sb = new StringBuilder(S);

		String newWord = S;
		int total = 0;
		

		for (int i = 0; i < S.length() - 1; i++) {

			total = total + returnTotal(newWord);

			if (total > 100000000) {
				total = -1;
				break;
			}

			//Criando Nova Palavra excluindo sempre a primeira
			sb.deleteCharAt(0);			
			newWord = sb.toString();

		}

		//System.out.println("Total..: " + total);

		return total;

	}

	public static int returnTotal(String S) {
		int total = 0;

		if (S.length() < 1)
			return 0;

		String crescente = Character.toString(S.charAt(0));
		String decrescente = "";

		for (int i = 1; i < S.length(); i++) {

			crescente = crescente + S.charAt(i);
			// System.out.println("Nova Crescente... " + crescente);

			for (int j = crescente.length() - 1; j >= 0; j--) {

				decrescente = decrescente + crescente.charAt(j);

			}

			if (crescente.equals(decrescente)) {
				total++;
				// System.out.println("crescente... " + crescente);
				// System.out.println("decrescente... " + decrescente);
			}
			// System.out.println("decrescente... " + decrescente);
			decrescente = "";

		}

		// System.out.println("Total..: " + total);

		return total;
	}
	
}
