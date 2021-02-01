//kny
package backtracking;

import java.util.Scanner;

//N과 M(2)
public class bj15650 {
	
	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();

		visit = new boolean[N + 1]; //숫자 1부터 세니까
		arr = new int[M];
		dfs(0);

	}
	
	private static void dfs(int d) {
		if (d == M) { //원소가 M개 뽑혔을 때
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(); 
			return;
		} else {
			for (int i = 1; i <= N; i++) {
				if (visit[i] == false) {
					if (d == 0 || arr[d-1] < i) { //d가 0일땐 다 출력, 그 외엔 뒤에 오는 숫자가 큰 경우만
						visit[i] = true;
						arr[d] = i;
						dfs(d + 1);
						// 백트래킹
						visit[i] = false;
					}
			
				}
			}
		}

	}
}

