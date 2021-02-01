//kny
package backtracking;

import java.util.Scanner;

//N�� M(4)
public class bj15652 {

	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		visit = new boolean[N + 1]; //���� 1���� ���ϱ�
		arr = new int[M];
		dfs(0);
		System.out.println(sb);

	}

	private static void dfs(int d) {
		if (d == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		} else {
			for (int i = 1; i <= N; i++) { //visit üũ ���ϱ� (���� �ߺ� ����ϵ���)
				if (d == 0 || arr[d-1] <= i) { //d==0�̰ų�, �ڿ����� ���� ���ų� ū ���
					visit[i] = true;
					arr[d] = i;
					dfs(d + 1);
					// ��Ʈ��ŷ
					visit[i] = false;
				}
			}
		}

	}

}
