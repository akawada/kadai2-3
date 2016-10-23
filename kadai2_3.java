import java.util.Scanner;

public class kadai2_3 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		String strin2;
		int numflg =0;
		int opeflg =0;
		double total = 0;
		double num=0;
		// 初回が数字でなければ終了する。
		System.out.print("任意の数字を入力してください ");
		strin =scan.next();
		if (!chknum(strin)){
			System.out.print("数字の入力でなかったため終了します");
			System.exit(-1);
		}
		else{
			total = Double.parseDouble(strin);
		}
		
		// 入力の繰り返し
		while (true) {
			// 四則演算の繰り返し
			if (opeflg == 0){
				System.out.println("演算子またはeを入力してください ");
				System.out.print("eで演算結果を出力します ");
				strin = scan.next();
				if (chkope(strin) == true){
					opeflg = 1;
					numflg = 0;
					if( strin.equals("e") || strin.equals("E")) {
						System.out.println("計算結果は" + total + "です");
						break;
					}
				}
				else{
					System.out.println("演算子には+, -, *, /, のいずれかを入力する必要があります");	
					continue;
				}
			}	
			// 数値の繰り返し
			if (numflg == 0){
				System.out.print("任意の数字を入力してください ");
				strin2 =scan.next();
				if (chknum(strin2)){
					opeflg = 0;
					numflg = 1;
					num = Double.parseDouble(strin2);
					if (strin.equals("+")) {
						total += num;
						System.out.println( total );
					}
					else if (strin.equals("-")) {
						total -= num;
						System.out.println( total );
					}
					else if (strin.equals("*")) {
						total *= num;
						System.out.println( total );
					}
					else if (strin.equals("/")) {
						if (num == 0 ) {
							System.out.print("0で割ることはできません\n");
							break;
						}
						total /= num;
						System.out.println( total );
						
					}
					// 一応...
					else {
						System.out.println("演算子には+, -, *, /, のいずれかを入力する必要があります");
					}
				}
				else{
					System.out.println("数字の入力をしてください");
				}
			}
		}	
		scan.close();
	}

	// 数値チェック
	static boolean chknum(String numchk) {
		try {
			Double.parseDouble(numchk);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// 演算子チェック
	static boolean chkope(String opechk) {
		if (opechk.equals("+")) {
			return true;
		}
		else if (opechk.equals("-")) {
			return true;
		}
		else if (opechk.equals("*")) {
			return true;
		}
		else if (opechk.equals("/")) {
			return true;
		}
		else if (opechk.equals("e") || opechk.equals("E") ){
			return true;
		}
		else{
			return false;
		}
	}

}


