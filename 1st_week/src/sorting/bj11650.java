//kny
package sorting;

import java.util.*;

//��ǥ �����ϱ�
public class bj11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[][] sortingArray = new int[n][2];

		//��ǥ �Է¹ޱ�
		for (int i = 0; i < n; i++) {
			sortingArray[i][0] = scan.nextInt();
			sortingArray[i][1] = scan.nextInt();
		}

	
		//��ǥ ����
		Arrays.sort(sortingArray, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if (x[0] == y[0]) { //x��ǥ�� ���� ��
					return x[1] - y[1]; // y��ǥ�� ���Ͽ� ����
				}
				return x[0]- y[0]; 
			}

		});
		

		//���İ�� ���
		for (int i = 0; i < n; i++) {
			System.out.print(sortingArray[i][0] + " ");
			System.out.println(sortingArray[i][1]);
		}
	}

}
