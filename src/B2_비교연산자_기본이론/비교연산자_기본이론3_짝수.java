package B2_�񱳿�����_�⺻�̷�;

public class �񱳿�����_�⺻�̷�3_¦�� {
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 3;
		/*
		 * �񱳿����ڸ� Ȱ���� ¦�� , Ȧ�� �Ǻ��� 
		 * 
		 * ¦�� ==> 2�� ����̸� ¦�� 
		 * Ȧ�� ==> 2�� ����� �ƴϸ� Ȧ�� 
		 * 
		 * 2�� ��� ==> ����� 2�γ������� �������� 0�̸� 2�ǹ�� 
		 * 3�� ��� ==> ����� 3���γ������� �������� 0�̸� 3�� ��� 
		 */
		
		System.out.println(" ¦�� : " + (a%2 == 0));
		System.out.println(" Ȧ�� : " + (b%2 == 0));
		System.out.println(" Ȧ�� : " + (c%2 == 0));
		
		System.out.println(" 5�ǹ�� : " + (a%5 == 0));
		System.out.println(" 4�ǹ�� : " + (b%4 == 0));
		System.out.println(" 3�ǹ�� : " + (c%3 == 0));
		
	}
}