//kny
package bruteforce;

import java.util.*;

public class Blackjack {

	public static List<Integer> totals = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // N장의 카드
		int M = scan.nextInt(); // 딜러가 발표할 수 M

		// N장의 카드 입력
		int[] cardArray = new int[N];
		for (int i = 0; i < N; i++) {
			cardArray[i] = scan.nextInt();
		}

//		N장의 카드중 3장을 뽑는 조합들을 구한 후,
//		totals라는 전역변수에 저장. 
//		blackjack함수에서 totals에서 M보다 작으면서 가장 큰 수를 찾아 반환.

		boolean[] vistied = new boolean[N];
		combination(cardArray, vistied, 0, N, 3);
		System.out.println(blackjack(M));

	}

	public static int blackjack(int m) {
		int max = 0;
		List<Integer> passed = new ArrayList<Integer>();
		for (int object : totals) {
			if (object <= m)
				passed.add(object);
		}

		for (int object : passed) {
			if (max < object)
				max = object;
		}
		return max;

	}

	// 각 조합의 array의 합을 구해 전역변수 totals에 저장.
	public static void result(int[] arr, boolean[] visited) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				total += arr[i];
			}
		}
		totals.add(total);
	}

	// n개의 카드 중 r개를 고르는 조합을 구하는 함수
	public static void combination(int[] arr, boolean[] visited, int depth, int n, int r) {

		// base case
		if (r == 0) {// 하나의 조합이 만들어졌을 때
			result(arr, visited);
			return;
		}
		if (depth == n) { // 조합을 모두 찾았을 때
			return;
		}

		else {
			// 현재 인덱스(depth)가 조합에 선택될경우
			visited[depth] = true;
			combination(arr, visited, depth + 1, n, r - 1);

			// 현재 인덱스가 조합에 선택되지 않은 경우
			visited[depth] = false;
			combination(arr, visited, depth + 1, n, r);
		}
	}
}
