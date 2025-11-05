// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		// Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		System.out.println("pi according to Java:" + Math.PI);
		double somewhatPI = 0.0;
		int j = 1;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 1) {
				somewhatPI = somewhatPI - (1.0 / j);
				System.out.println("here 2 " + somewhatPI);
			} else {
				somewhatPI = somewhatPI + (1.0 / j);
				System.out.println("here 1 " + somewhatPI);
			}
			j = j + 2;
		}
		System.out.println("pi, approximated: " + (somewhatPI * 4.0));
		/*
		 * int j = 1;
		 * for (int i = 0; i < num; i++) {
		 * somewhatPI = somewhatPI + (1.0 / j) - (1.0 / (j + 2));
		 * System.out.println(somewhatPI);
		 * j = j + 4;
		 * }
		 * if (num % 2 == 1) {
		 * // System.out.println("Here");
		 * somewhatPI = somewhatPI + (1.0 / (j - 2));
		 * }
		 * if (num % 2 == 0) {
		 * // System.out.println("Here");
		 * somewhatPI = somewhatPI + (1.0 / (j - 2) - (1.0 / (j - 4)));
		 * }
		 * System.out.println("pi, approximated: " + (somewhatPI * 1.0));
		 */
	}
}
