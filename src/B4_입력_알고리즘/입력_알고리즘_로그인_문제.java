package B4_�Է�_�˰���;

import java.util.Scanner;

public class �Է�_�˰���_�α���_���� {
	/*		 
	 * [����] 
	 * 		ö���� �α����� �Ϸ��� �Ѵ�. 
	 * 		���̵�� ��й�ȣ�� �Է¹޴´�. 
	 * 		���̵�� ��й�ȣ �����ϳ���Ʋ���� �α����� �����մϴ�.
	 * 		ö���� �α����� �����ұ��?
	 * 		joinId �� joinPw �� ö���� �̹̰����� ���̵�� ��й�ȣ�Դϴ�.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int joinId = 1234;
		int joinPw = 4321;
		
		//�ȳ���1
		System.out.println("���̵� �Է� : ");
		int logId = scan.nextInt();
		//�ȳ���2
		System.out.println("��й�ȣ�� �Է� : ");
		int logPw = scan.nextInt();
		
		//�α׾Ƶ�� ���ξƵ�� ���ƾߵǰ�, �α׺���� ���κ���� ���ƾߵȴ�.
		System.out.println(joinId == logId && joinPw == logPw);
		
		
		

		
	}
}