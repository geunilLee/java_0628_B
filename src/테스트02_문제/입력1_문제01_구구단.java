package 테스트02_문제;

import java.util.Scanner;

/*		 
	[문제] 
		구구단 문제를 제시한다
		정답을 입력하고 맞으면 true 출력		
		[1] 숫자 2개를 입력받는다.
		[2] 이 숫자 2개는 문제를 뜻한다.
		[3] 정답 1개를 입력받는다.
		[4] 위 숫자2개의 곱과 정답이 같으면 true 출력 
*/
public class 입력1_문제01_구구단 {
	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자1을 입력하시오 : ");
		int num1 =scan.nextInt();
		
		System.out.println("숫자2을 입력하시오 : ");
		int num2 =scan.nextInt();
		
		System.out.println("정답을 입력하시오 : ");
		int 정답 =scan.nextInt();
		
		System.out.println(num1*num2==정답);
		
	}
}