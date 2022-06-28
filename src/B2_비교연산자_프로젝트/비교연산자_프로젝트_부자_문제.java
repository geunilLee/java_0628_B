package B2_비교연산자_프로젝트;

public class 비교연산자_프로젝트_부자_문제 {
	/*
	 * [문제]
		철수는 13살 철수의 아버지는 45살이다. 
		몇년후 철수의 아버지는 철수나이의 3배가될까요?
		
	 */
	public static void main(String[] args) {		
		
	
		int a = 0;
		System.out.println((a + 13) * 3 == 45 + a);// 양쪽을 3으로나눈다. 
		
		System.out.println(a + 13 == 15 + a/3);	 // 좌변의 13을 처리한다.
		System.out.println(a == 2 + a/3);        // 다시양쪽에 3을곱한다.
		System.out.println(a * 3 == 6 + a);  	 // 우변의 a를 처리한다.
		System.out.println(a * 2 == 6);			 // 양변을 2로나눈다.
		System.out.println(a == 3);
		a = 3;
		
		System.out.println( (a + 13) * 3 == 45 + a);
	}
}