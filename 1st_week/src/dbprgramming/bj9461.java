//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// �ĵ��� ����
// �Ǻ���ġ ���� ����� ��Ģ�� ã�� ���� ��ȹ������ Ǫ�� ����

public class bj9461 {

	public static long[] memo = new long[101]; //int�� ������ �ʰ���.

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		memo[0] = 1;
		memo[1] = 1;
		memo[2] = 1;
		//4��° �������� ��Ģ ���� ����.

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
