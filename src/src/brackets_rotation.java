package src;

import java.util.ArrayList;
import java.util.List;

public class brackets_rotation {

	public static void main(String[] args) {
		/*
		 * Ultimo Resultado:
		 * https://app.codility.com/demo/results/trainingP4JAVF-8QV/
		 * 
		 * https://app.codility.com/programmers/task/brackets_rotation/
		 * 
		 * A bracket sequence is considered to be a valid bracket expression if
		 * any of the following conditions is true:
		 * 
		 * it is empty; it has the form "(U)" where U is a valid bracket
		 * sequence; it has the form "VW" where V and W are valid bracket
		 * sequences. For example, the sequence "(())()" is a valid bracket
		 * expression, but "((())(()" is not.
		 * 
		 * You are given a sequence of brackets S and you are allowed to rotate
		 * some of them. Bracket rotation means picking a single bracket and
		 * changing it into its opposite form (i.e. an opening bracket can be
		 * changed into a closing bracket and vice versa). The goal is to find
		 * the longest slice (contiguous substring) of S that forms a valid
		 * bracket sequence using at most K bracket rotations.
		 * 
		 * Write a function:
		 * 
		 * int solution(char *S, int K);
		 * 
		 * that, given a string S consisting of N brackets and an integer K,
		 * returns the length of the maximum slice of S that can be transformed
		 * into a valid bracket sequence by performing at most K bracket
		 * rotations.
		 * 
		 * For example, given S = ")()()(" and K = 3, you can rotate the first
		 * and last brackets to get "(()())", which is a valid bracket sequence,
		 * so the function should return 6 (notice that you need to perform only
		 * two rotations in this instance, though).
		 */

		String S = ")()()(";
		int K = 3;
		solucao5(S, K);

	}

	public static int solucao5(String S, int K) {
		int result = 0;
		int i = 0;
		String aux = "";
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> novaLista = new ArrayList<String>();

		while (i < S.length()) {

			list.add(Character.toString(S.charAt(i)));
			i++;

		}

		for (i = 0; i < list.size(); i++) {

			if (i == list.size() - 1) {
				novaLista.add(list.get(i));
				result = result + contar(novaLista, K);
				break;

			}

			if (list.get(i).equals(")")) {
				novaLista.add(list.get(i));

			} else {

				aux = list.get(i) + list.get(i + 1);

				if (aux.equals("()")) {

					result = result + 2;
					i++;

				} else {
					int x = i;
					int aberto = 0;
					int fechado = 0;

					while (!aux.equals("()") && x < list.size() - 1) {
						aux = list.get(x) + list.get(x + 1);
						aberto++;
						x++;
					}

					while (list.get(x).equals(")")) {
						fechado++;
						x++;
						if (list.size() == x)
							break;
					}

					if (fechado > aberto) {						
						i = i + (2 * aberto) - 1;	
						result = result + (2 * aberto);
					}

					if (aberto >= fechado) {						
						i = x - 1;
						result = result + (2 * fechado);
						for (int y = fechado; y < aberto; y++) {
							novaLista.add("(");
						}
					}

					if (i >= list.size() - 1) {
						result = result + contar(novaLista, K);
						break;

					}

				}

			}

		}	

		return result;

	}

	public static int contar(ArrayList<String> novaLista, int K) {
		int result = 0;
		String aux = "";

		int countOpostos = 0;

		//System.out.println("Lista..:" + novaLista);

		for (int j = 0; j < novaLista.size() - 1; j++) {
			aux = novaLista.get(j) + novaLista.get(j + 1);

			if (aux.equals("))") && K > 0) {
				result = result + 2;
				K--;
				j++;
			}

			if (aux.equals("((") && K > 0) {
				result = result + 2;
				K--;
				j++;
			}

			if (aux.equals(")(") && K > 1) {
				countOpostos = countOpostos + 2;

				if (j < novaLista.size() - 2) {

					aux = novaLista.get(j + 1) + novaLista.get(j + 2);

					if (aux.equals("((")) {
						K--;
						j = j + 2;
						result = result + 2;
					}
				}

			}
		}

		// Entender a Relação Entre os Contadores de K
		if (K > 1 && countOpostos > 1) {

			if (K >= countOpostos) {
				K = K - countOpostos;
				result = result + countOpostos;
			} else {
				int qtdK = (K % 2);
				K = K - qtdK;
				result = result + 2 * qtdK;
			}
		}

		return result;
	}

	public static int solution(String S, int K) {
		int result = 0;
		int[] opened = new int[S.length()];
		int[] closed = new int[S.length()];
		int iclosed = 0;
		int iopened = 0;
		int alterado = 0;

		int i = 0;
		int j = 0;
		int x = 0;

		for (char word : S.toCharArray()) {
			if (word == '(') {
				iopened++;
				opened[i] = x;

				// System.out.println("Aberto.." + opened[i]);

			} else {
				closed[j] = x;
				iclosed++;
				// System.out.println("Fechado..." + closed[j]);
				j++;
			}
			x++;
		}

		if (iopened == iclosed)
			result = iclosed + iopened;

		// System.out.println("valid bracket..: " + result);

		return result;
	}

	public static int solucao4(String S, int K) {

		int result = 0;
		String aux = "";
		List<Integer> indice = new ArrayList<>();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> listFora = new ArrayList<>();

		for (int i = 0; i < S.length() - 1; i++) {

			System.out.println("AuxiliarISSS..:" + i);
			aux = Character.toString(S.charAt(i)) + S.charAt(i + 1);
			System.out.println("AuxiliarI..:" + aux);

			if (aux.equals("()")) {

				indice.add(i);
				indice.add(i + 1);
				result = result + 2;
				i++;

				if ((i + 1) == S.length() - 1) {
					listFora.add(S.length() - 1);
				}

			} else {
				listFora.add(i);

			}

		}

		System.out.println("Lista..:" + listFora);
		System.out.println("Resultado Final..:" + result);

		return result;
	}

	public static int solucao3(String S, int K) {
		int result = 0;
		int i = 0, j = 0;
		String aux = "";
		boolean achou = false;
		String nova = "";
		ArrayList<String> list = new ArrayList<String>();
		List<Integer> indice = new ArrayList<>();

		while (i < S.length()) {

			// System.out.println("Lista Montagem..:" + S.charAt(i));

			list.add(Character.toString(S.charAt(i)));
			i++;

		}

		i = 0;

		int tamanho = list.size();

		while ((tamanho - 1) - 2 > j) {

			aux = list.get(i) + list.get(i + 1);

			if (aux.equals(")(") && K > 1 && j >= list.size() - 1) {

				K = K - 2;
				list.set(i, "(");
				list.set(i + 1, ")");
				aux = list.get(i) + list.get(i + 1);

			}

			if (aux.equals("()")) {

				result = result + 2;

				list.remove(i);
				list.remove(i);
				i = 0;
				achou = true;
			} else {
				i++;
				j++;

			}

		}

		System.out.println("Resultado Final..:" + result);

		return result;
	}

	public static String solucao2(String S, int K) {
		int result = 0;
		String aux = "";
		String nova = "";

		ArrayList<String> list = new ArrayList<String>();

		int i = 0;

		while (i < S.length() - 1) {

			aux = Character.toString(S.charAt(i)) + S.charAt(i + 1);
			System.out.println("AuxiliarI..:" + aux);
			if (aux.equals("()")) {
				result = result + 2;
				i = i + 2;

			} else {

				list.add(Character.toString(S.charAt(i)));
				nova = nova + Character.toString(S.charAt(i));

				i++;
			}

			if (i == S.length() - 1) {
				System.out.println("Valor do I..:" + i);
				System.out.println("TAMANHO ..:" + (S.length() - 1));
				list.add(Character.toString(S.charAt(S.length() - 1)));
				nova = nova + Character.toString(S.charAt(S.length() - 1));
			}

		}

		System.out.println("Total Parcial..:" + result);

		if (list.size() > 1) {

			int tamanhoLista = list.size() / 2;
			int auxiliar = 2;

			if (list.size() == 2) {
				auxiliar = 1;
			}

			for (int j = 0; j < tamanhoLista; j++) {

				aux = list.get(j) + list.get(j + auxiliar);

				System.out.println("Auxiliar LISTA..:" + aux);

				if (aux.equals("()")) {
					result = result + 2;

					// System.out.println("Nova Lista" + aux);
				}

				if (aux.equals(")(") && K > 2) {
					result = result + 2;
					K = K - 2;
					// System.out.println("Nova Lista" + aux);
				}

				if (aux.equals("))") && K > 1) {
					result = result + 2;
					K = K - 1;
				}

				aux = list.get(j) + list.get(j + auxiliar);

			}

		}

		System.out.println("Total..:" + result);

		return nova;
	}
}
