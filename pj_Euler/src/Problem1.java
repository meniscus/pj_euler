import java.util.*;

public class Problem1 {

	/**
	 * 10未満の自然数のうち, 3 もしくは 5 の倍数になっているものは 3, 5, 6, 9 の4つがあり, これらの合計は 23 になる.
	 * 同じようにして, 1000 未満の 3 か 5 の倍数になっている数字の合計を求めよ.
	 *
	 *
	 */
	public static void main(String args[]) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> multiples= new ArrayList<String>();
		final int UPPER_LIMIT = 1000;

		for(int i = 0; i < UPPER_LIMIT ; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				// 3の倍数で5の倍数でない数を配列に格納
				multiples.add(Integer.toString(i));
			}
		}

		int sum = 0;
		for(int i = 0; i < multiples.size() ; i++) {
			sum += Integer.parseInt(multiples.get(i));
		}

		System.out.println(sum);
	}

}
