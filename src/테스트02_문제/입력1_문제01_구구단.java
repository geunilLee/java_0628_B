package �׽�Ʈ02_����;

import java.util.Scanner;

/*		 
	[����] 
		������ ������ �����Ѵ�
		������ �Է��ϰ� ������ true ���		
		[1] ���� 2���� �Է¹޴´�.
		[2] �� ���� 2���� ������ ���Ѵ�.
		[3] ���� 1���� �Է¹޴´�.
		[4] �� ����2���� ���� ������ ������ true ��� 
*/
public class �Է�1_����01_������ {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����1�� �Է��Ͻÿ� : ");
		int num1 =scan.nextInt();
		
		System.out.println("����2�� �Է��Ͻÿ� : ");
		int num2 =scan.nextInt();
		
		System.out.println("������ �Է��Ͻÿ� : ");
		int ���� =scan.nextInt();
		
		System.out.println(num1*num2==����);
		
	}
}