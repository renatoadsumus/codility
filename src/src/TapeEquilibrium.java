package src;

import java.util.ArrayList;

public class TapeEquilibrium {

	public static void main(String[] args) {

		int[] myListA = { 3, 1, 2, 4, 3 };

		// P = 1, difference = |3 − 10| = 7
		// P = 2, difference = |4 − 9| = 5
		// P = 3, difference = |6 − 7| = 1
		// P = 4, difference = |10 − 3| = 7
		// Return 1
		solution(myListA);

	}

	public static int solution(int[] A) {

		ArrayList<Integer> resultDifferenceList = new ArrayList<Integer>();

		for (int i = 1; i < A.length; i++) {
			resultDifferenceList.add(returnDifferenceBetweenTwoParts(A, i));
		}

		int minimalDifference = resultDifferenceList.get(0);

		for (int value : resultDifferenceList) {

			if (minimalDifference > value) {
				minimalDifference = value;				
			}
		}

		return minimalDifference;
	}

	public static Integer returnDifferenceBetweenTwoParts(int[] A, int position) {

		int totalPat1 = 0;
		int totalPat2 = 0;

		for (int i = 0; i < position; i++) {
			totalPat1 = totalPat1 + A[i];
		}

		for (int i = position; i < A.length; i++) {
			totalPat2 = totalPat2 + A[i];
		}

		int difference = totalPat1 - totalPat2;

		if (totalPat2 > totalPat1)
			difference = totalPat2 - totalPat1;

		System.out.println(difference);

		return difference;

	}

}
