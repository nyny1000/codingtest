//kny
package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//연산자 끼워넣기
public class bj14888 {
	
	private static int N;
	private static int[] numbers;
	private static int min = Integer.MAX_VALUE;
	private static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		String ns =  br.readLine();
		StringTokenizer st = new StringTokenizer(ns);
		numbers = new int[N];
		for (int i=0; i <N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		ns = br.readLine();
		st = new StringTokenizer(ns);
		int op[] = new int[4];
		for (int i=0; i <op.length; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(1, op[0], op[1], op[2], op[3], numbers[0]);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	static void dfs(int depth, int p, int s, int m, int d, int sum) {

		if (depth == N) { //연산 끝나면 
			min = Integer.min(min, sum);
			max = Integer.max(max, sum);
			return;
		}
		
		
		if (p>0) {
			dfs(depth+1, p-1, s, m, d, sum + numbers[depth]);
		}
		if (s>0) {
			dfs(depth+1, p, s-1, m, d, sum - numbers[depth]);
		}
		if (m>0) {
			dfs(depth+1, p, s, m-1, d, sum * numbers[depth]);
		}
		if (d>0) {
			dfs(depth+1, p, s, m, d-1, sum / numbers[depth]);
		}
		
	}
	
	

}
