//kny
package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//스타트와 링크
public class bj14889 {

	public static int N;
	public static int[][] map;
	public static boolean[] visit;

	public static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		map = new int[N][N];
		visit = new boolean[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0,0);
		System.out.println(min);
	}
	
	private static void dfs(int idx, int d) { // 조합으로 visit한 팀원들 or 안 한 팀원들로 팀을 나누기
		if (d == N/2 ) {
			diff_status();
			return;
		} else {
			for (int i = idx; i < N; i++) {
				if (visit[i] == false) {
					visit[i] = true;
					dfs(i+1, d + 1);
					// 백트래킹
					visit[i] = false;
				}
			}
		}

	}
	
	static void diff_status() {
		int startTeam = 0;
		int linkTeam = 0;
 
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				// i 번째 사람과 j 번째 사람이 true -> 스타투
				if (visit[i] == true && visit[j] == true) {
					startTeam += map[i][j];
					startTeam += map[j][i];
				}
				// i 번째 사람과 j 번째 사람이 false -> 링크
				else if (visit[i] == false && visit[j] == false) {
					linkTeam += map[i][j];
					linkTeam += map[j][i];
				}
			}
		}
		// 두 팀의 점수 차이
		int diff = Math.abs(startTeam - linkTeam);
		
		
		min = Math.min(diff, min);
				
	}
	
	

}
