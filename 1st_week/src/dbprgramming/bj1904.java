//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//01타일
//점화식의 값을 특정 상수로 나눈 나머지를 구하는 문제
//피보나치 수열
public class bj1904 {

	public static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		memo = new int[10000001]; // N으로 하면 배열 에러남. N+2로 하면 가능 

		memo[0] = 0;
		memo[1] = 1;
		memo[2] = 2;

		for (int i = 3; i < memo.length; i++) {
			memo[i] = -1;
		}
		
		System.out.println(tile(N));

	}

	public static int tile(int N) {
		if (memo[N] == -1)
			return memo[N] = (tile(N - 1) + tile((N - 2))) % 15746;
		return memo[N];
	}

}
