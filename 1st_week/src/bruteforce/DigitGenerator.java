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

		//생성자가 없을 시 0반환
		return 0;

	}

	//생성자의 각 자리수에 해당하는 숫자를 더해 반환.
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
