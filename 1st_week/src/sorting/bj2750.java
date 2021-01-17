//kny
package sorting;

import java.util.*;

// 수 정렬하기
public class bj2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<Integer> sortingArray = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			sortingArray.add(scan.nextInt());
		}

		Collections.sort(sortingArray);

		for (int i = 0; i < n; i++) {
			System.out.println(sortingArray.get(i));
		}
	}
}
