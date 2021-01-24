//kny
package backtracking;

import java.util.*;

public class bj15649 {
	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;
	
	public static void main(String[] args) {
		
		// 1 ~ N���� �� �� M�� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		visit = new boolean[N+1];
		arr = new int[M];
		dfs(0);
		
	}

	private static void dfs(int d) {
		//M = 2
		if (d == M) {
			for (int i=0; i<M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			
			for (int i=1; i<=N; i++) {
				//������ visit[i]�� true�� �� 1�� ������
				if (visit[i] == false) {
					visit[i] = true;
					arr[d] = i;
					//���
					dfs(d+1);
					//��Ʈ��ŷ
					visit[i] = false;
				}
			}
		}
		
		
	}
}