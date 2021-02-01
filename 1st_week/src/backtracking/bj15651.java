//kny
package backtracking;

import java.util.Scanner;

//N과 M(3)
//(1)처럼 프린트로 하니까 시간초과됨. 그래서 stringbuilder 사용
public class bj15651 {

	private static int N, M;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

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
					arr[d] = i;
					dfs(d + 1);
			}
		}

	}
}