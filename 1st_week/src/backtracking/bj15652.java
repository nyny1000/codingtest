//kny
package backtracking;

import java.util.Scanner;

//N과 M(4)
public class bj15652 {

	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		visit = new boolean[N + 1]; //숫자 1부터 세니까
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
			for (int i = 1; i <= N; i++) { //visit 체크 안하기 (숫자 중복 허용하도록)
				if (d == 0 || arr[d-1] <= i) { //d==0이거나, 뒤에오는 수가 같거나 큰 경우
					visit[i] = true;
					arr[d] = i;
					dfs(d + 1);
					// 백트래킹
					visit[i] = false;
				}
			}
		}

	}

}
