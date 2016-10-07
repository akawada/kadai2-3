import java.util.Scanner;

public class kadai2_3 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		String strin2;
		int ngflg=0;
		double total = 0;
		double num=0;
		// 初回が数字でなければ終了する。
		System.out.print("任意の数字を入力してください ");
		strin =scan.next();
		if (chknum(strin) == false){
			System.out.print("数字の入力でなかったため終了します");
			System.exit(-1);
		}
		else{
			total = Double.parseDouble(strin);
		}
		
		// 入力の繰り返し
		while (true) {
			// 四則演算の繰り返し
			while(true){
				System.out.println("演算子またはeを入力してください ");
				System.out.print("eで演算結果を出力します ");
				strin = scan.next();
				if (chkope(strin) == false){
					System.out.println("演算子には+, -, *, /, のいずれかを入力する必要があります");				}
				else{
					break;
				}
			}
				if( strin.equals("e") || strin.equals("E")) {
					break;
				}
	
				// 数値の繰り返し
				while (true) {
					System.out.print("任意の数字を入力してください ");
					strin2 =scan.next();
						if (chknum(strin2) == false){
						}
						else{
							num = Double.parseDouble(strin2);
							break;
						}
				}
				if (strin.equals("+")) {
					total += num;
				}
				else if (strin.equals("-")) {
					total -= num;
				}
				else if (strin.equals("*")) {
					total *= num;
				}
				else if (strin.equals("/")) {
					total /= num;
					if (num == 0 ) {
						System.out.print("0で割ることはできません\n");
						ngflg = 1;
						break;
						
					}
				}
			
				// 一応...
				else {
					System.out.println("演算子には+, -, *, /, のいずれかを入力する必要があります");
				}
		}
				
		if (ngflg == 0){
			System.out.print( "答えは" + total + "です\n");
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


