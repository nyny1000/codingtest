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
		System.out.println(move);
		System.out.print(sb);

	}

	public static void hanoi(int n, int start, int mid, int to) {

		move++;

		// basecase: 원판이 하나 남았을 때
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}

		else {
			hanoi(n - 1, start, to, mid); // 1번째 탑에 있던 n-1개의 원판을 2번째 탑으로 이동
			sb.append(start + " " + to + "\n"); // 1번째 탑에 있던 가장 큰 원판을 3번째 탑으로 이동
			hanoi(n - 1, mid, start, to); // 2번째 탑에 있던 모든 원판을 3번째 탑으로 이동
		}

	}

}
