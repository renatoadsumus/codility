package src;

public class FrogJmp {

	public static void main(String[] args) {

		// A small frog wants to get to the other side of the road
		// X = 10
		// Y = 85
		// D = 30
		// the function should return 3, because the frog will be positioned as
		// follows:
		//
		// after the first jump, at position 10 + 30 = 40
		// after the second jump, at position 10 + 30 + 30 = 70
		// after the third jump, at position 10 + 30 + 30 + 30 = 100

		// 3, 999111321, 7

		System.out.println(solution2(3, 999111321, 7));
		//System.out.println(solution2(10, 85, 30));

	}

	public static int solution(int x, int y, int d) {

		int missWalk = y - x;
		int amountJumps = 0;

		while (missWalk > 0) {

			amountJumps++;
			missWalk = missWalk - d;
		}

		return amountJumps;
	}

	public static int solution2(int x, int y, int d) {

		int walk = x;
		int amountJumps = 0;

		while (walk < y) {

			amountJumps++;			
			walk = walk + d;
			System.out.println("Andei.." + walk);
		}


		return amountJumps;
	}

}
