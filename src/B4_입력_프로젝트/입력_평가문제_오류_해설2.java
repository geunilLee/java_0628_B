package B4_�Է�_������Ʈ;

import java.util.Scanner;

public class �Է�_�򰡹���_����_�ؼ�2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		/*
		 * [����] 
		 * 		���� 3���� �Է¹޴´�.
		 * 		�׼����߿� �Ѱ��� ���ڶ� Ȧ���������� �����Դϴ�.
		 * 		�Ʒ����ڵ��������� �ֳ���?
		 */
		
		//�ȳ���1
		System.out.println("����1 �Է��Ͻÿ� : ");
		//����1�Է�
		int n1 = scan.nextInt();
		//�ȳ���2
		System.out.println("����2 �Է��Ͻÿ� : ");
		//����2�Է�
		int n2 = scan.nextInt();
		//�ȳ���2
		System.out.println("����3 �Է��Ͻÿ� : ");
		//����3�Է�
		int n3 = scan.nextInt();
		// �ϳ��� Ȧ���� false, �׷��Ƿ� ��δ� ¦�������Ѵ�.	
		System.out.println(n1%2 == 0 && n2%2 == 0 && n3%2 == 0);
		
		
		
		
		
	}
}