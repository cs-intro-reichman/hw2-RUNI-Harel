// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		String verb = args[1];
		int startNun = num;
		int cnt = 1;
		for (int i = 1; i <= startNun; i++) {
			boolean isFirstTime = true;
			cnt = 1;
			int currNum = i;
			if (verb.equals("v")) {
				System.out.print(i + " ");
			}
			while (currNum != 1 || isFirstTime == true) {
				isFirstTime = false;
				if (currNum % 2 == 0) {
					currNum = currNum / 2;
				} else {
					currNum = currNum * 3 + 1;
				}
				if (verb.equals("v")) {
					System.out.print(currNum + " ");
				}
				cnt++;
			}
			if (verb.equals("v")) {
				System.out.println("(" + cnt + ")");
			}
		}
		System.out.printf("Every one of the first %d hailstone sequences reached 1.", num);
		/*
		 * boolean isFirstTime = true;
		 * System.out.println(startNun);
		 * while (startNun != 1 || isFirstTime == true) {
		 * isFirstTime = false;
		 * if (startNun % 2 == 0) {
		 * startNun = startNun / 2;
		 * } else {
		 * startNun = startNun * 3 + 1;
		 * }
		 * System.out.println(startNun);
		 * cnt++;
		 * }
		 * System.out.println("total: " + cnt);
		 */
	}
}
