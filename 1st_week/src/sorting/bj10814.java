//kny
package sorting;

import java.util.*;

//나이순 정렬
public class bj10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		String sortingArray[][] = new String[n][2];

		for (int i = 0; i < n; i++) {
			sortingArray[i][0] = scan.next();
			sortingArray[i][1] = scan.next();
		}

		// 좌표 정렬
		Comparator<String[]> comparator = new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub 
				//나이순 정렬
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));

			}

		};

		Arrays.sort(sortingArray, comparator);
		for (int i = 0; i < n; i++) {
			System.out.print(sortingArray[i][0] + " ");
			System.out.println(sortingArray[i][1]);
		}

	}
}
