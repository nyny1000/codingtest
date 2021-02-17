//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파도반 수열
// 피보나치 수와 비슷한 규칙을 찾아 동적 계획법으로 푸는 문제

public class bj9461 {

	public static long[] memo = new long[101]; //int형 범위를 초과함.

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 1;
		//4번째 수열부터 규칙 적용 가능.

		for (int i = 3; i < memo.length; i++) {
			memo[i] = -1;
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(padovan(n - 1)).append("\n");
		}

		System.out.println(sb);

	}

	public static long padovan(int N) {
		if (memo[N] == -1) {
			return memo[N] = padovan(N - 3) + padovan(N - 2);
		}
		return memo[N];
	}

}
