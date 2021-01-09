//kny
import java.util.*;

public class Hanoi {

	static StringBuilder sb = new StringBuilder();
	static int move = 0; // ������ �� �̵� Ƚ��

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

		// basecase: ������ �ϳ� ������ ��
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}

		else {
			hanoi(n - 1, start, to, mid); // 1��° ž�� �ִ� n-1���� ������ 2��° ž���� �̵�
			sb.append(start + " " + to + "\n"); // 1��° ž�� �ִ� ���� ū ������ 3��° ž���� �̵�
			hanoi(n - 1, mid, start, to); // 2��° ž�� �ִ� ��� ������ 3��° ž���� �̵�
		}

	}

}
