package B3_��������_�⺻�̷�;

public class ��������_�⺻�̷�2_����3 {
	public static void main(String[] args) {
		// ����1) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		
	/*
	 * 3*4 == 3+2 && 3>2
	 */
		int a = 4;
		int b = 1;
		int c = 3;
		int d = 1;

		System.out.println(a * d == c + b && a > b);
		// ����2) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 2;
		b = -1;
		c = 4;
		d = 1;
		System.out.println(a / d + 3 == c - b && a > b);
		// ����3) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 4;
		b = 2;
		c = -6;
		d = 1;
		System.out.println(a % d == c % b && a > b);
		// ����4) �Ʒ� ���� ���� true �� �������� ���� �����غ�����.
		a = 6;
		b = 3;
		c = 36;
		d = 1;
		System.out.println((a - d) * 3 == c / 3 + b && a > b);
	}
}