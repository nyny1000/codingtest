//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//�ų��� �Լ� ���� �ų��� ��̳���
public class bj9184 {

	// �޸������̼�.
	public static int[][][] memo = new int[21][21][21];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) {
				break; // ���ѹݺ��� while ��������
			}

			sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append("\n");
		}
		System.out.println(sb);
	}

	public static int w(int a, int b, int c) {

		//a b c�� ������ üũ���� �ʰ� �ϸ� ArrayIndexOutOfBoundsException ���� �߻�.
		if (check(a, b, c) == true && memo[a][b][c] != 0)
			return memo[a][b][c];

		if (a <= 0 || b <= 0 || c <= 0)
			return 1;

		if (a > 20 || b > 20 || c > 20)
			return memo[20][20][20] = w(20, 20, 20);

		if (a < b && b < c)
			return memo[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);

		return memo[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}

	
	public static boolean check(int a, int b, int c) {
		if (a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20)
			return true;
		return false;
	}

}
