//kny
import java.util.*;

public class Hanoi {

	static StringBuilder sb = new StringBuilder();
	static int move = 0; // 원판의 총 이동 횟수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
 
		hanoi(n, 1, 2, 3);
		System.out.println(move); // 원판 이동횟수
		System.out.print(sb); // 워판 이동순서

	}

//	start: 원판이 있던 위치
//	to: 원판을 옮기고자 하는 위치
//	mid: 원판을 옮길 때 거쳐가는 위치
	public static void hanoi(int n, int from, int mid, int to) {

		move++;// 이동횟수

		// base case: 원판이 하나 남았을 때
		if (n == 1) {
			sb.append(from + " " + to + "\n"); // 하나의 원판이 이동할 때 
			return;
		}

		else {
			hanoi(n - 1, from, to, mid); // 1번째 탑에 있던 n-1개의 원판을 2번째 탑으로 이동
			sb.append(from + " " + to + "\n"); // 1번째 탑에 있던 가장 큰 원판을 3번째 탑으로 이동
			hanoi(n - 1, mid, from, to); // 2번째 탑에 있던 모든 원판을 3번째 탑으로 이동
		}

	}

}
