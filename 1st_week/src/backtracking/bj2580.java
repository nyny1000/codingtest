//kny
package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//����������
public class bj2580 {

	public static int[][] map;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		map = new int[9][9];

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

	}

	// 0�� �� ���� Ȯ�� 
	/* ��ĭ0�� ���� ä�ﶧ �����ٿ� �ִ���, ���� �ٿ� �ִ���, 3*3�� �ִ��� Ȯ�� */

}
