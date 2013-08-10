import java.util.*;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fibonacci_sequence = new ArrayList<String>();
		final int MAX_SEQ_NUM = 4000000;

		int index =0;	// 配列のインデックス

		// 最初の2項を設定する
		fibonacci_sequence.add(index++,"1");
		fibonacci_sequence.add(index++,"2");

		// 前の2項の和を取り、最新の項を生成
		int incl = Integer.parseInt(fibonacci_sequence.get(index-1)) + Integer.parseInt(fibonacci_sequence.get(index-2));

		// 最大値を超えるまで項を生成
		while (incl < MAX_SEQ_NUM) {
			fibonacci_sequence.add(index++,Integer.toString(incl));
			incl = Integer.parseInt(fibonacci_sequence.get(index-1)) + Integer.parseInt(fibonacci_sequence.get(index-2));
		}

		//要素は0から始まるので偶数項は奇数を取り出す

		int sum = 0;
		for (int i = 1; i <= fibonacci_sequence.size() ; i += 2) {
			sum += Integer.parseInt(fibonacci_sequence.get(i));

		}

		System.out.println(sum);




	}

}
