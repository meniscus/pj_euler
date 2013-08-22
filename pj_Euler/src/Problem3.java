import java.math.*;

public class Problem3 {

	/**
	 * 13195 の素因数は 5, 7, 13, 29 である.
	 * 600851475143 の素因数のうち最大のものを求めよ.
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//	final int TARGET_NUMBER = 13195;
	//	final long TARGET_NUMBER = 600851475143;
		final BigInteger TARGET_NUMBER = new BigInteger("600851475143");
	//	final BigInteger TARGET_NUMBER = new BigInteger("13195");
	//	final BigInteger TARGET_NUMBER = new BigInteger("60");
		final int BIGGER_THAN_VAL = 1;
	//	final int SMALLER_THAN_VAL = -1;

		int debug_count = 0;


		int max_pf = 0;
		// 対象を割ることのできる最大の素数iを求める
		BigInteger i = TARGET_NUMBER;

		for(i = TARGET_NUMBER.subtract(i.ONE) ; BIGGER_THAN_VAL == i.compareTo(i.ONE) ; i = i.subtract(i.ONE)) {
			if ( TARGET_NUMBER.remainder(i) == i.ZERO) {
				// 割り切れるならばその数が素数であるか調べる(自身以外の数で割れないことを確かめる)
				boolean prime_flg = true;
				for (BigInteger j = new BigInteger("2"); -1 == j.compareTo(i) ; j = j.add(j.ONE)) {
					if(i.remainder(j) == j.ZERO) {
						//自身以外の数で割れた場合は素数ではない
						System.out.println("not prime");
						prime_flg = false;
						break;
					}
	//				System.out.println(j);
				}

				//
				if(prime_flg == true) {
					System.out.println(i.toString());
				}


			}
		}
	}

}
