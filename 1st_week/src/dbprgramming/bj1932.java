//kny
package dbprgramming;

// ���� �ﰢ��
// �� ���� ��� ĭ���� �ִ��� �����ϸ鼭 ���� ��ȹ������ Ǫ�� ����

import java.util.Scanner;
 
public class bj1932 {
 
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int[][] nums = new int[N][];

	        for (int i = 0; i < N; i++) {
	            nums[i] = new int[i + 1];

	            for (int j = 0; j <= i; j++)
	                nums[i][j] = scan.nextInt();
	        }

	        for (int i = N - 1; i > 0; i--) { // ���� �Ʒ������ ���� ���ϸ鼭 ���ϱ�
	            for (int j = 0; j < i; j++)
	                nums[i-1][j] += Math.max(nums[i][j], nums[i][j + 1]);
	        }

	        System.out.println(nums[0][0]); //���� ���ذ��鼭 ���ϱ� ������ ���� ������ �ִ밪�� �ִ�

	    }
}