package B2_�񱳿�����_������Ʈ;

public class �񱳿�����_������Ʈ_����_���� {
	/*
	 * [����]
		ö���� 13�� ö���� �ƹ����� 45���̴�. 
		����� ö���� �ƹ����� ö�������� 3�谡�ɱ��?
		
	 */
	public static void main(String[] args) {		
		
	
		int a = 0;
		System.out.println((a + 13) * 3 == 45 + a);// ������ 3���γ�����. 
		
		System.out.println(a + 13 == 15 + a/3);	 // �º��� 13�� ó���Ѵ�.
		System.out.println(a == 2 + a/3);        // �ٽþ��ʿ� 3�����Ѵ�.
		System.out.println(a * 3 == 6 + a);  	 // �캯�� a�� ó���Ѵ�.
		System.out.println(a * 2 == 6);			 // �纯�� 2�γ�����.
		System.out.println(a == 3);
		a = 3;
		
		System.out.println( (a + 13) * 3 == 45 + a);
	}
}