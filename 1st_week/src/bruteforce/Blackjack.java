//kny
package bruteforce;

import java.util.*;

public class Blackjack {

	public static List<Integer> totals = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); // N���� ī��
		int M = scan.nextInt(); // ������ ��ǥ�� �� M

		// N���� ī�� �Է�
		int[] cardArray = new int[N];
		for (int i = 0; i < N; i++) {
			cardArray[i] = scan.nextInt();
		}

//		N���� ī���� 3���� �̴� ���յ��� ���� ��,
//		totals��� ���������� ����. 
//		blackjack�Լ����� totals���� M���� �����鼭 ���� ū ���� ã�� ��ȯ.

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

	// �� ������ array�� ���� ���� �������� totals�� ����.
	public static void result(int[] arr, boolean[] visited) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == true) {
				total += arr[i];
			}
		}
		totals.add(total);
	}

	// n���� ī�� �� r���� ���� ������ ���ϴ� �Լ�
	public static void combination(int[] arr, boolean[] visited, int depth, int n, int r) {

		// base case
		if (r == 0) {// �ϳ��� ������ ��������� ��
			result(arr, visited);
			return;
		}
		if (depth == n) { // ������ ��� ã���� ��
			return;
		}

		else {
			// ���� �ε���(depth)�� ���տ� ���õɰ��
			visited[depth] = true;
			combination(arr, visited, depth + 1, n, r - 1);

			// ���� �ε����� ���տ� ���õ��� ���� ���
			visited[depth] = false;
			combination(arr, visited, depth + 1, n, r);
		}
	}
}
