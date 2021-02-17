//kny
package dbprgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// RGB�Ÿ�
// i��° ���� ������ ������ ĥ�� ��, 1~i��° ���� ��� ĥ�ϴ� �ּ� ������� �κй����� �����غ��ô�.

public class bj1149 {

	public static int[][] cost;
	public static int[][] totalMemo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		cost = new int[N][3];
		totalMemo = new int[N][3];
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cost[i][0] = Integer.parseInt(st.nextToken()); // ���������� ���� �� ���
			cost[i][1] = Integer.parseInt(st.nextToken()); // �ʷ�
			cost[i][2] = Integer.parseInt(st.nextToken()); // �Ķ�
		}

		totalMemo[0][0] = cost[0][0];
		totalMemo[0][1] = cost[0][1];
		totalMemo[0][2] = cost[0][2];
		
		// 3���� ���� �� ���� �ּҺ���� ����.
		System.out.println(Math.min(calculateCost(N- 1, 0), Math.min(calculateCost(N - 1, 1), calculateCost(N - 1, 2))));

	}

	public static int calculateCost(int N, int color) {
		if (totalMemo[N][color] == 0) {

			// �� �÷� ���ÿ� ���� ���ǿ� �°� �ּҺ���� ��������� ���
			if (color == 0) {
				totalMemo[N][0] = Math.min(calculateCost(N - 1, 1), calculateCost(N - 1, 2)) + cost[N][0];
			} else if (color == 1) {
				totalMemo[N][1] = Math.min(calculateCost(N - 1, 0), calculateCost(N - 1, 2)) + cost[N][1];
			} else {
				totalMemo[N][2] = Math.min(calculateCost(N - 1, 0), calculateCost(N - 1, 1)) + cost[N][2];
			}

		}
		return totalMemo[N][color];
	}

}
