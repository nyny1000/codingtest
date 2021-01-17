//kny
package sorting;

import java.util.*;

//좌표 정렬하기
public class bj11650 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[][] sortingArray = new int[n][2];

		//좌표 입력받기
		for (int i = 0; i < n; i++) {
			sortingArray[i][0] = scan.nextInt();
			sortingArray[i][1] = scan.nextInt();
		}

	
		//좌표 정렬
		Arrays.sort(sortingArray, new Comparator<int[]>() {
			@Override
			public int compare(int[] x, int[] y) {
				if (x[0] == y[0]) { //x좌표가 같을 때
					return x[1] - y[1]; // y좌표를 비교하여 정렬
				}
				return x[0]- y[0]; 
			}

		});
		

		//정렬결과 출력
		for (int i = 0; i < n; i++) {
			System.out.print(sortingArray[i][0] + " ");
			System.out.println(sortingArray[i][1]);
		}
	}

}
