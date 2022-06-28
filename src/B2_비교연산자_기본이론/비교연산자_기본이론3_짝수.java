package B2_비교연산자_기본이론;

public class 비교연산자_기본이론3_짝수 {
	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 3;
		/*
		 * 비교연산자를 활용해 짝수 , 홀수 판별법 
		 * 
		 * 짝수 ==> 2의 배수이면 짝수 
		 * 홀수 ==> 2의 배수가 아니면 홀수 
		 * 
		 * 2의 배수 ==> 어떤수를 2로나눴을때 나머지가 0이면 2의배수 
		 * 3의 배수 ==> 어떤수를 3으로나눴을때 나머지가 0이면 3의 배수 
		 */
		
		System.out.println(" 짝수 : " + (a%2 == 0));
		System.out.println(" 홀수 : " + (b%2 == 0));
		System.out.println(" 홀수 : " + (c%2 == 0));
		
		System.out.println(" 5의배수 : " + (a%5 == 0));
		System.out.println(" 4의배수 : " + (b%4 == 0));
		System.out.println(" 3의배수 : " + (c%3 == 0));
		
	}
}