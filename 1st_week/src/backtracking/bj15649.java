//kny
package backtracking;

import java.util.*;

//N�� M(1)
public class bj15649 {
	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		visit = new boolean[N + 1]; //���� 1���� ���ϱ�
		arr = new int[M];
		dfs(0);

	}

	private static void dfs(int d) {
		if (d == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i = 1; i <= N; i++) {
				if (visit[i] == false) {
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