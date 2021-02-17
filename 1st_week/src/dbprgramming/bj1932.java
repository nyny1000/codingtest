//kny
package dbprgramming;

// 정수 삼각형
// 각 층의 모든 칸마다 최댓값을 저장하면서 동적 계획법으로 푸는 문제

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

	        for (int i = N - 1; i > 0; i--) { // 가장 아래행부터 위로 비교하면서 더하기
	            for (int j = 0; j < i; j++)
	                nums[i-1][j] += Math.max(nums[i][j], nums[i][j + 1]);
	        }

	        System.out.println(nums[0][0]); //위로 비교해가면서 더하기 때문에 가장 위에는 최대값이 있다

	    }
}