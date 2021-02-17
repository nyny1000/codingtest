//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 함수
// 단순 재귀로 피보나치 수를 구하면 왜 느릴까요? 함수 호출의 개수가 기하급수적으로 늘어나기 때문입니다.

public class bj1003 {

	public static int[][] memo = new int[41][2];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		memo[0][0] = 1;
		memo[0][1] = 0;
		memo[1][0] = 0;
		memo[1][1] = 1;

		for (int i = 2; i < 41; i++) { 
			for (int j = 0; j < 2; j++) {
				memo[i][j] = memo[i - 1][j] + memo[i - 2][j];
			}
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(memo[n][0]).append(" ").append(memo[n][1]).append("\n");
		}

		System.out.println(sb);

	}

}
