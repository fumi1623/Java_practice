package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {
			System.out.println("100 + 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生");
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
//  catchブロックには、例外が発生した時に実行する処理を記述
//  finallyブロックに、例外発生の有無にかかわらず必ず実行する処理