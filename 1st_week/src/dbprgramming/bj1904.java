//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//01Ÿ��
//��ȭ���� ���� Ư�� ����� ���� �������� ���ϴ� ����
//�Ǻ���ġ ����
public class bj1904 {

	public static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		memo = new int[10000001]; // N���� �ϸ� �迭 ������. N+2�� �ϸ� ���� 

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
