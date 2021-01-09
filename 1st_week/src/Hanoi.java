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

//	start: ������ �ִ� ��ġ
//	to: ������ �ű���� �ϴ� ��ġ
//	mid: ������ �ű� �� ���İ��� ��ġ
	public static void hanoi(int n, int from, int mid, int to) {

		move++;

		// base case: ������ �ϳ� ������ ��
		if (n == 1) {
			sb.append(from + " " + to + "\n");
			return;
		}

		else {
			hanoi(n - 1, from, to, mid); // 1��° ž�� �ִ� n-1���� ������ 2��° ž���� �̵�
			sb.append(from + " " + to + "\n"); // 1��° ž�� �ִ� ���� ū ������ 3��° ž���� �̵�
			hanoi(n - 1, mid, from, to); // 2��° ž�� �ִ� ��� ������ 3��° ž���� �̵�
		}

	}

}
