package B4_�Է�_������Ʈ;

import java.util.Scanner;

public class �Է�_�򰡹���_����_����3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * [����] 
		 * 		���� 3���� �Է¹޴´�.
		 * 		�׼����߿� �Ѱ��� ���ڶ� Ȧ���������� �����Դϴ�.
		 * 		�Ʒ����ڵ��������� �ֳ���?
		 */
		
		System.out.println("����1 �Է��Ͻÿ� : ");
		int n1 = scan.nextInt();
				
		System.out.println("����2 �Է��Ͻÿ� : ");
		int n2 = scan.nextInt();
		
		System.out.println("����3 �Է��Ͻÿ� : ");
		int n3 = scan.nextInt();
		
		System.out.println(n1%2 == 0 && n2%2 == 0 && n3%2 == 0);
		

	}
}