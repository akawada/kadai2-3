import java.util.Scanner;

public class kadai2_3 {
	public static void main( String[] args) {
		Scanner scan = new Scanner(System.in);
		String strin;
		String strin2;
		int ngflg=0;
		double total = 0;
		double num=0;
		// ���񂪐����łȂ���ΏI������B
		System.out.print("�C�ӂ̐�������͂��Ă������� ");
		strin =scan.next();
		if (chknum(strin) == false){
			System.out.print("�����̓��͂łȂ��������ߏI�����܂�");
			System.exit(-1);
		}
		else{
			total = Double.parseDouble(strin);
		}
		
		// ���͂̌J��Ԃ�
		while (true) {
			// �l�����Z�̌J��Ԃ�
			while(true){
				System.out.println("���Z�q�܂���e����͂��Ă������� ");
				System.out.print("e�ŉ��Z���ʂ��o�͂��܂� ");
				strin = scan.next();
				if (chkope(strin) == false){
					System.out.println("���Z�q�ɂ�+, -, *, /, �̂����ꂩ����͂���K�v������܂�");				}
				else{
					break;
				}
			}
				if( strin.equals("e") || strin.equals("E")) {
					break;
				}
	
				// ���l�̌J��Ԃ�
				while (true) {
					System.out.print("�C�ӂ̐�������͂��Ă������� ");
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
						System.out.print("0�Ŋ��邱�Ƃ͂ł��܂���\n");
						ngflg = 1;
						break;
						
					}
				}
			
				// �ꉞ...
				else {
					System.out.println("���Z�q�ɂ�+, -, *, /, �̂����ꂩ����͂���K�v������܂�");
				}
		}
				
		if (ngflg == 0){
			System.out.print( "������" + total + "�ł�\n");
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


