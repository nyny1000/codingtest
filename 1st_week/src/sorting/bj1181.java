//kny
package sorting;
import java.util.*;

//�ܾ� ����
public class bj1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> wordList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			wordList.add(scan.next());
		}
		
		ArrayList<String> sortingList = new ArrayList<String>();
		
		for (int i=0; i<wordList.size(); i++)
		{
			if (!sortingList.contains(wordList.get(i)))
				sortingList.add(wordList.get(i));

		}
		
		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if (o1.length() > o2.length()) // ���ڿ� ���� ���ϱ�
					return 1;
				else if (o1.length() < o2.length()) // ���ڿ� ���� ���ϱ� 2
					return -1;
				else
					return o1.compareTo(o2);// o1=o2�̸� 0 / o1>o2�� 1 / o1<o2 �̸� -1
				}
			
		};
		
		Collections.sort(sortingList, comparator);
		
		for(String s : sortingList) {
			System.out.println(s);
		}
	} 

}
