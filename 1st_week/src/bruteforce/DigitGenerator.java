//kny
package bruteforce;

import java.util.*;

public class DigitGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		System.out.println(digitGenerator(N));
	}

	public static int digitGenerator(int n) {
		int generator = 0;

		for (int i = 0; i < n; i++) {
			generator = i;
			if (generator + digitSum(generator) == n)
				return generator;
		}

		return 0;

	}

	public static int digitSum(int generator) {
		List<Integer> digitArray = new ArrayList<Integer>();
		int sum = 0;

		while (generator > 0) {
			digitArray.add(generator % 10);
			generator = generator / 10;
		}

		for (int i : digitArray) {
			sum += i;
		}

		return sum;
	}

}
