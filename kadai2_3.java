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
		// ���񂪐����łȂ���ΏI������B
		System.out.print("�C�ӂ̐�������͂��Ă������� ");
		strin =scan.next();
		if (!chknum(strin)){
			System.out.print("�����̓��͂łȂ��������ߏI�����܂�");
			System.exit(-1);
		}
		else{
			total = Double.parseDouble(strin);
		}
		
		// ���͂̌J��Ԃ�
		while (true) {
			// �l�����Z�̌J��Ԃ�
			if (opeflg == 0){
				System.out.println("���Z�q�܂���e����͂��Ă������� ");
				System.out.print("e�ŉ��Z���ʂ��o�͂��܂� ");
				strin = scan.next();
				if (chkope(strin) == true){
					opeflg = 1;
					numflg = 0;
					if( strin.equals("e") || strin.equals("E")) {
						System.out.println("�v�Z���ʂ�" + total + "�ł�");
						break;
					}
				}
				else{
					System.out.println("���Z�q�ɂ�+, -, *, /, �̂����ꂩ����͂���K�v������܂�");	
					continue;
				}
			}	
			// ���l�̌J��Ԃ�
			if (numflg == 0){
				System.out.print("�C�ӂ̐�������͂��Ă������� ");
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
							System.out.print("0�Ŋ��邱�Ƃ͂ł��܂���\n");
							break;
						}
						total /= num;
						System.out.println( total );
						
					}
					// �ꉞ...
					else {
						System.out.println("���Z�q�ɂ�+, -, *, /, �̂����ꂩ����͂���K�v������܂�");
					}
				}
				else{
					System.out.println("�����̓��͂����Ă�������");
				}
			}
		}	
		scan.close();
	}

	// ���l�`�F�b�N
	static boolean chknum(String numchk) {
		try {
			Double.parseDouble(numchk);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// ���Z�q�`�F�b�N
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


