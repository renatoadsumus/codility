package src;

public class Desafio {

	public static void main(String[] args) {

		String S = "Amanha eu quero. Carro. De graca? Vou jogar bola com meu tio";
		solution(S);

	}

	public static int solution(String S) {
		int count = 0;
		int aux = 0;

		String[] parts = S.split("\\.");
	

		for (int i = 0; i < parts.length; i++) {

			String part = parts[i];

			String[] parts1 = part.split("\\?");

			if (parts1.length > 1) {

				for (int j = 0; j < parts1.length; j++) {

					String[] splits1 = parts1[j].split(" ");

					aux = 0;
					for (int x = 0; x < splits1.length; x++) {

						if (!splits1[x].equals(""))
							aux++;
					}

				}

				if (aux > count)
					count = aux;

			} else {

				String[] splits2 = part.split(" ");
				aux = 0;
				for (int j = 0; j < splits2.length; j++) {

					if (!splits2[j].equals(""))
						aux++;

				}

				if (aux > count)
					count = aux;
			}

		}

		return count;

	}
}
